package staff.management;

public class Director extends Manager {

    private Double budget;

    public Director(String name, int NI, double salary, String deptName, Double budget) {
        super(name, NI, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Double payBonus(){
        return this.getSalary() * 0.02;
    }
}
