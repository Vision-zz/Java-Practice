public class Main {

    static {
        University university = University.getInstance();
        String[] deptStrings = { "Mechanical", "Aero", "Automobile", "Mechatronics", "Biotech" };
        for(String dept : deptStrings) {
            university.addDepartment(new Department(dept));
        }
    }

    public static void main(String[] args) {

        // Implement all features like adding depts, professors, friends of professors and stuff.
        // Im just lazy, create pull request and I might merge it. Thanks :)

    }
}
