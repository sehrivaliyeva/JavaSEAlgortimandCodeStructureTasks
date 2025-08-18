package salarytask;

public class Main {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee(1, "Orxan", 400, 20, 2);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(2, "Serxan", 15, 100);
        SalariedEmployee salariedEmployee = new SalariedEmployee(3, "Agalar", 6000.0);
        Company company = new Company();
        company.addEmployee(commissionEmployee);
        company.addEmployee(hourlyEmployee);
        company.addEmployee(salariedEmployee);
        System.out.println(company.highestPaidEmployee());
        System.out.println(company.totalPayroll()
        );
        company.printPayrollReport();

    }
}