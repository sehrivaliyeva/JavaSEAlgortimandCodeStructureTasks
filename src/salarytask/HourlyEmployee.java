package salarytask;

public class HourlyEmployee extends Employee {

    double hourlyRate;
    double hoursWorked;

    public HourlyEmployee(int id, String name, double hourlyRate, double hoursWorked) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        if (hoursWorked <= 160) {
            return hourlyRate * hoursWorked;
        } else {
            double normalSalary = hourlyRate * 160;
            double overTime = (hoursWorked - 160) * hourlyRate * 1.5;
            return normalSalary + overTime;
        }

    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
