import java.util.List;

public class Department {
    private List<Professor> activeProfessors;
    private String name;

    Department(String name) {
        this.name = name;
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
