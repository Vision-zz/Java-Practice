import java.util.List;

public class University {
    private List<Department> departments;
    private String name = "No Name University";

    // Singleton class 
    private static University university = null;
    public static University getInstance() {
        if (university == null)
            university = new University();
        return university;
    }
    private University() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(this.name);
    }

    public String getName() {
        return this.name;
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public void listAllDepartments() {
        String departmentString = "";
        for (Department p : this.departments) {
            departmentString += p.getName() + " | ";
        }
        System.out.println(departmentString);
    }

    public List<Department> getAllDepartments() {
        return departments;
    }
}
