package StudentSystem;

public class ShowCommand implements Command {
    public void execute(StudentRepository repo, String[] args) {
        String name = args[1];
        if (repo.containsStudentByName(name)) {
            var student = repo.findOneByName(name);
            System.out.println(student.toString());
        }
    }
}
