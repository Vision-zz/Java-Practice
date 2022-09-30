package Associations;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private final List<Professor> activeProfessors;
    private final String name;

    Department(String name) {
        this.activeProfessors = new ArrayList<Professor>();
        this.name = name;
    }

    public void addProfessor(Professor professor) {
        activeProfessors.add(professor);
    }

    public void printActiveProfessors() {
        String activeProfessorString = "";
        for (Professor p : this.activeProfessors) {
            activeProfessorString += p.getName() + " | ";
        }
        System.out.println(activeProfessorString);
    }

    public List<Professor> getActiveProfessors() {
        return activeProfessors;
    }

    public Professor getProfessor(String name) {
        for (Professor p : this.activeProfessors)
            if (p.getName().equals(name))
                return p;
        return null;
    }

    public Professor getProfessor(int professorID) {
        for (Professor p : this.activeProfessors)
            if (p.getProfessorID() == professorID)
                return p;
        return null;
    }

    public String getName() {
        return this.name;
    }

}
