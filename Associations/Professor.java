package Associations;

import java.util.ArrayList;
import java.util.List;

public class Professor {

    private String name;
    private int age;
    private final int professorID;
    private final List<Professor> friends;
    static private int ID = 1;

    Professor(String name, int age) {
        this.name = name;
        this.age = age;
        this.professorID = ID++;
        friends = new ArrayList<Professor>();
    }

    public String getName() {
        return this.name;
    }

    public void editName(String name) {
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

    public void addFriend(Professor professor) {
        friends.add(professor);
    }

    public List<Professor> getFriends() {
        return friends;
    }

    /**
     * Returns the first friend of this Professor with the specified name.
     * Returns null of not found
     * @param name - name of the friend
     * @return {@value}Professor
     */
    public Professor getFriend(String name) {
        for (Professor f : this.friends)
            if (f.name.equals(name))
                return f;
        return null;
    }

    /**
     * Returns the professor with the specified ID.
     * Returns null if not found
     * @param professorID - ID of the professor
     * @return {@value} Professor
     */
    public Professor getFriend(int professorID) {
        for(Professor p : friends) {
            if(p.professorID == professorID) {
                return p;
            }
        }
        return null;
    }
}
