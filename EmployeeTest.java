public class EmployeeTest {
    Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President")
    Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
    Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
    for(int i = 0; i < 120; i++){
        System.out.print("\u2500");//unicode for a line character 
    }
    System.out.printf("%-30s%-30s%-30s%-30s%n", "Name", "ID Nmber", "Department", "Position");
}
