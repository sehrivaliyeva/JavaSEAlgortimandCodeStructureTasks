package salarytask;

public class CommissionEmployee extends Employee {
    double baseSalary;
    double totalSales;
    double commissionRate;

    public CommissionEmployee(int id, String name, double baseSalary, double totalSales, double commissionRate) {
        super(id, name);
        this.baseSalary = baseSalary;
        this.totalSales = totalSales;
        this.commissionRate = commissionRate;
    }

    @Override
    double calculateSalary() {
        return baseSalary + totalSales * commissionRate;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "baseSalary=" + baseSalary +
                ", totalSales=" + totalSales +
                ", commissionRate=" + commissionRate +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
