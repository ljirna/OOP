package Ispit;
import java.util.List;
import java.util.stream.Collectors;

public record Employee(int id, String name, double salary) {
}

class EmployeeManagementSystem {

    public List<Employee> filterEmployeesBySalary(List<Employee> employees, double minSalary) {
        return employees.stream()
                .filter(employee -> employee.salary() >= minSalary)
                .collect(Collectors.toList());
    }

    public double calculateTotalSalary(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::salary)
                .sum();
    }

    public void displayEmployeeDetails(List<Employee> employees) {
        for (Employee e : employees) {
            System.out.println("ID: " + e.id() + " | Name: " + e.name() + " | Salary: $" + e.salary());
        }
    }
}

class MainTwo {
    public static void main(String[] args) {
        EmployeeManagementSystem employeeManagementSystem = new EmployeeManagementSystem();

        List<Employee> employees = List.of(
                new Employee(1, "Mujo", 50000.0),
                new Employee(2, "Suljo", 60000.0),
                new Employee(3, "Fata", 75000.0)
        );

        List<Employee> filteredEmployees = employeeManagementSystem.filterEmployeesBySalary(employees, 60000.0);
        System.out.println("Employees with minimum salary:");
        employeeManagementSystem.displayEmployeeDetails(filteredEmployees);

        double totalSalary = employeeManagementSystem.calculateTotalSalary(employees);
        System.out.println("Total salary of all employees: $" + totalSalary);

        System.out.println("Employee Details:");
        employeeManagementSystem.displayEmployeeDetails(employees);
    }
}

