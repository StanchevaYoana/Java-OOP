package StudentSystem;

public class CommandFactory {
   public static Command createCommand(String commandType){
       switch (commandType){
           case "Create": return new CreateCommand();
           case "Show": return  new ShowCommand();
           default:
               throw new IllegalArgumentException("Unknown command!");

       }
    }
}
