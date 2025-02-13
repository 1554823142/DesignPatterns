
public class NoCommand implements Command {
    public void execute(){
        System.out.println("Do nothing, it's a no command");
    }

    public void undo(){
        System.out.println("Do nothing, it's a no command");
    }
}
