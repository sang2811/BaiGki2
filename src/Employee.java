import java.util.ArrayList;

interface IEmployee {
    void showInfo();
}

class Employee implements IEmployee {
    protected int ID;
    protected String FullName;
    protected String BirthDay;
    protected String Phone;
    protected String Email;
    protected String Employee_type;
    protected static int Employee_count = 0;

    public Employee(int ID, String FullName, String BirthDay, String Phone, String Email, String Employee_type) {
        this.ID = ID;
        this.FullName = FullName;
        this.BirthDay = BirthDay;
        this.Phone = Phone;
        this.Email = Email;
        this.Employee_type = Employee_type;
        Employee_count++;
    }

    @Override
    public void showInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Full Name: " + FullName);
        System.out.println("Birth Day: " + BirthDay);
        System.out.println("Phone: " + Phone);
        System.out.println("Email: " + Email);
        System.out.println("Employee Type: " + Employee_type);
        System.out.println("Employee Count: " + Employee_count);
    }
}

class Experience extends Employee {
    private int ExpInYear;
    private String ProSkill;

    public Experience(int ID, String FullName, String BirthDay, String Phone, String Email, int ExpInYear, String ProSkill) {
        super(ID, FullName, BirthDay, Phone, Email, "Experience");
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Years of Experience: " + ExpInYear);
        System.out.println("Professional Skill: " + ProSkill);
    }
}

class Fresher extends Employee {
    private String Graduation_date;
    private String Graduation_rank;
    private String Education;

    public Fresher(int ID, String FullName, String BirthDay, String Phone, String Email, String Graduation_date, String Graduation_rank, String Education) {
        super(ID, FullName, BirthDay, Phone, Email, "Fresher");
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Graduation Date: " + Graduation_date);
        System.out.println("Graduation Rank: " + Graduation_rank);
        System.out.println("Education: " + Education);
    }
}

class Intern extends Employee {
    private String Majors;
    private String Semester;
    private String University_name;

    public Intern(int ID, String FullName, String BirthDay, String Phone, String Email, String Majors, String Semester, String University_name) {
        super(ID, FullName, BirthDay, Phone, Email, "Intern");
        this.Majors = Majors;
        this.Semester = Semester;
        this.University_name = University_name;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Majors: " + Majors);
        System.out.println("Semester: " + Semester);
        System.out.println("University Name: " + University_name);
    }
}

class EmployeeManager {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public boolean deleteEmployee(int employeeID) {
        for (Employee employee : employees) {
            if (employee.ID == employeeID) {
                employees.remove(employee);
                //employees_count--;
                return true;
            }
        }
        return false;
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            employee.showInfo();
            System.out.println();
        }
    }
}
