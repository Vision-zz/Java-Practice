import java.util.ArrayList;
import java.util.List;

public class Professor {

    private String name;
    private int age;
    private int professorID;
    private Department department;
    private List<Professor> friends;
    static private int ID = 1;

    Professor(String name, int age, Department department) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.professorID = ID++;
        friends = new ArrayList<Professor>();
    }

    public String getName() {
        return this.name;
    }

    public void ediName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void changeAge(int age) {
        this.age = age;
    }

    public int getProfessorID() {
        return this.professorID;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void addFriend(Professor professor) {
        friends.add(professor);
    }

    public List<Professor> getFriends() {
        return friends;
    }

    public List<Professor> getFriends(String name) {
        ArrayList<Professor> friendsOfX = new ArrayList<>();
        for (Professor f : this.friends)
            if (f.name.equals(name))
                friendsOfX.add(f);
        return friendsOfX;
    }
}
