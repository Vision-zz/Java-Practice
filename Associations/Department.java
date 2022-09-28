import java.util.List;

public class Department {
    private List<Professor> activeProfessors;
    private String name;

    Department(String name) {
        this.name = name;
    }

    public void printActiveProfessors() {
        String activeProfessorString = "";
        for(Professor p : this.activeProfessors) {
            activeProfessorString += p.getName() + " | ";
        }
        System.out.println(activeProfessorString);
    }

    public List<Professor> getActiveProfessors() {
        return activeProfessors;
    }

    public String getName() {
        return this.name;
    }
}
