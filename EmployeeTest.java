public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 50000);
        Manager manager = new Manager("Jane Smith", 75000, "HR");
        Executive executive = new Executive("Alice Johnson", 100000, "Finance");

        System.out.println("Employee Information:");
        System.out.println(employee);

        System.out.println("\nManager Information:");
        System.out.println(manager);

        System.out.println("\nExecutive Information:");
        System.out.println(executive);
    }
}
