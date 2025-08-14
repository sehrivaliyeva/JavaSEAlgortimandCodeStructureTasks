package salarytask;

public class SalariedEmployee extends Employee {
    double monthlySalary;

    public SalariedEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
