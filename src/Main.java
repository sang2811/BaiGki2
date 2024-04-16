import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        Experience expEmployee = new Experience(1, "John Doe", "1990-01-01", "123456789", "john.doe@example.com", 5, "Java");
        Fresher fresherEmployee = new Fresher(2, "Jane Smith", "1995-05-05", "987654321", "jane.smith@example.com", "2020-06-30", "Excellent", "ABC University");
        Intern internEmployee = new Intern(3, "Tom Brown", "2000-10-10", "456789123", "tom.brown@example.com", "Computer Science", "Spring 2024", "XYZ University");

        try {
            PrintWriter pw = new PrintWriter("D:\\Intern.txt");
            pw.println(expEmployee);
            pw.println(fresherEmployee);
            pw.println(internEmployee);
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        manager.addEmployee(expEmployee);
        manager.addEmployee(fresherEmployee);
        manager.addEmployee(internEmployee);
        System.out.println("List of Employees:");
        manager.displayAllEmployees();

    }
}
