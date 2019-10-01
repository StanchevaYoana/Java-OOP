package StackOfStrings;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> data;

    public Stack() {
        data = new ArrayList<>();
    }

    public void push(String element) {
        data.add(element);
    }
    public String peek(){
        if (!data.isEmpty()){
            return data.get(data.size() -1);
        } else {
            return null;
        }
    }
    public String pop(){
        if (!data.isEmpty()){
            return data.remove(data.size() -1);
        } else {
            return null;
        }
    }
    public boolean isEmpty(){
        return data.isEmpty();
    }
}
