package Associations;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Department> departments = new ArrayList<Department>();
        departments.add(new Department("Mechanical"));
        departments.add(new Department("Aeronautical"));
        departments.add(new Department("Automobile"));
        University university = new University("Dummy University", departments);
        System.out.println(university.getName());

        // Implement all other features.
        // Like adding more depts, professors, friends of professors and stuff.
        // Im just lazy, create pull request and I might merge it. Thanks :)

    }
}
