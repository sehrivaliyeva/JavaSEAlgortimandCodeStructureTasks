package exceptiontask;

import java.util.Arrays;

public class Department {
    private int id;
    private String departmentName;
    private Employee[] employees;

    public Department(int id, String departmentName, int size) {
        this.id = id;
        this.departmentName = departmentName;
        this.employees = new Employee[size];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }

    public void addEmployee(Employee emekdas) {
        try {
            if (emekdas == null) {
                throw new MyNullException("EMPLOYEE IS NULL !!");
            }

            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    employees[i] = emekdas;
                    break;
                }
            }

        } catch (MyNullException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateEmployee(int id, Employee emekdas) {
        try {
            if (emekdas == null) {
                throw new MyNullException("EMPLOYEE IS NULL !!");
            }

            if (id < 0 || id > employees.length) {
                throw new NoArrayElemetFound("WRONG ID  !!");
            }

            boolean isNull = true;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    isNull = false;
                    break;
                }
            }

            if (isNull) {
                throw new ArrayEmptyException("ARRAY IS EMPTY  !!");
            }

/*                if (isci!=null && isci.getId() == id) {
                    isci=emekdas;
                    System.out.println(isci);
                    System.out.println("UPDATE !!");
                    break;
                } else {
                    throw new NoArrayElemetFound("WRONG ID  !!");
                }
            }*/
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getId() == id) {
                    employees[i] = emekdas;
                    System.out.println("Updated employee");
                    break;
                }
            }

        } catch (MyNullException | NoArrayElemetFound | ArrayEmptyException e) {
            System.out.println(e.getMessage());

        }

    }

}