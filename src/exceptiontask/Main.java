package exceptiontask;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "sehrigul", "valiyeva");
        Employee employee2 = new Employee(3, "sehrigul2", "valiyeva2");

        Department department = new Department(1, "IT", 5);

        department.addEmployee(employee1);

        department.updateEmployee(1, employee2);
        System.out.println(department);

    }
}
