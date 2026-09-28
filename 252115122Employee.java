package task3.java;

public class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double highersalary(Employee e) {
        if (this.salary > e.salary) {
            return this.salary;
        } else {
            return e.salary;
        }
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Sumon", 5);
        Employee e2 = new Employee("Penaldo", 0.5);

        System.out.println("Higher Salary: " + e1.highersalary(e2));
    }
}
