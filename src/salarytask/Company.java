package salarytask;

public class Company {
    Employee[] employees = new Employee[10];
    int count;

    public Company() {
        count = 0;
    }

    void addEmployee(Employee e) {
        if (e == null || count >= employees.length) return;
        employees[count++] = e;
    }

    double totalPayroll() {
        double total = 0;
        for (int i=0; i<count; i++) {
            total += employees[i].calculateSalary();
        }
        return total;
    }

    Employee highestPaidEmployee() {
        Employee highest = employees[0];
        double maxSalary = employees[0].calculateSalary();
        for (int i=1; i<count; i++) {
            if (employees[i].calculateSalary() > maxSalary) {
                maxSalary = employees[i].calculateSalary();
                highest = employees[i];
            }
        }
        return highest;
    }

    void printPayrollReport(){
        System.out.println("Payroll report");
        for (Employee e : employees) {
            if (e!= null) {
                System.out.println(e);
            }
    }


    }


}
