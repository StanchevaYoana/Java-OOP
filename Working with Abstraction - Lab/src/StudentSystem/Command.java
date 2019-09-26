package StudentSystem;

public interface Command {
    void execute(StudentRepository repo, String [] args);
}
