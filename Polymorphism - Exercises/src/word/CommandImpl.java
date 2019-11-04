package word;

import java.util.*;

public class CommandImpl implements CommandInterface {
    private class PasteTransform implements TextTransform {
        private Deque<String> cutRemember;

        public PasteTransform(Deque<String> cutRemember) {
            this.cutRemember = cutRemember;
        }

        @Override
        public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
            if (startIndex == endIndex) {
                text.insert(startIndex, cutRemember.peek());
            } else {
                text.replace(startIndex, endIndex, cutRemember.peek());
            }
        }
    }

    private class CutTransform implements TextTransform {

        private Deque<String> cutRemember;

        public CutTransform(Deque<String> cutRemember) {
            this.cutRemember = cutRemember;
        }

        @Override
        public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
            cutRemember.push(text.substring(startIndex, endIndex));
            if (startIndex != endIndex) {
                text.delete(startIndex, endIndex);

            } else {
                this.cutRemember.pop();
            }
        }
    }

    class ToUpperTransform implements TextTransform {

        @Override
        public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
            if (startIndex != endIndex) {
                for (int i = startIndex; i < endIndex; i++) {
                    text.setCharAt(i, Character.toUpperCase(text.charAt(i)));
                }
            }
        }
    }

    private Map<String, TextTransform> commandTransforms;

    private StringBuilder text;

    private Deque<String> cutRemember;

    public CommandImpl(StringBuilder text) {
        this.commandTransforms = new HashMap<>();
        this.text = text;
        this.cutRemember = new ArrayDeque<>();
    }

    @Override
    public void init() {
        this.commandTransforms.clear();
        for (Command p : this.initCommands()) {
            this.commandTransforms.putIfAbsent(p.getText(), p.getTextTransform());
        }
    }

    @Override
    public void handleInput(String input) {
        String[] tokens = input.split("\\s+");

        String commandName = tokens[0];
        int startInd = Integer.parseInt(tokens[1]);
        int endInd = Integer.parseInt(tokens[2]);

        this.commandTransforms.get(commandName).invokeOn(this.text, startInd, endInd);
    }

    protected List<Command> initCommands() {
        List<Command> commands = new ArrayList<>();
        commands.add(new Command("uppercase", new ToUpperTransform()));
        commands.add(new Command("cut", new CutTransform(cutRemember)));
        commands.add(new Command("paste", new PasteTransform(cutRemember)));

        return commands;
    }
}
