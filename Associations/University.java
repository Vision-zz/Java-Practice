package Associations;

import java.util.List;

public class University {
    private final List<Department> departments;
    private final String name;

    public University(String name, List<Department> departments) {
        this.name = name;
        this.departments = departments;
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

    public Department getDepartmentByName(String name) {
        for (Department d : this.departments)
            if (d.getName().equals(name))
                return d;
        return null;
    }

    public void removeDepartment(Department department) {
        this.departments.remove(department);
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
