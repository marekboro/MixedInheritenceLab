package staff;

public abstract class Employee {

    private String name;
    private int NI;
    private double salary;

    public Employee(String name, int NI, double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public int getNI() {
        return NI;
    }

    public void setNI(int NI) {
        this.NI = NI;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;

    }

    public void raiseSalary(Double salaryIncrease) {
        if (salaryIncrease >= 0) {
            this.salary += salaryIncrease;
        }
    }

    public Double payBonus() {
        return this.salary * 0.01;
    }


}
