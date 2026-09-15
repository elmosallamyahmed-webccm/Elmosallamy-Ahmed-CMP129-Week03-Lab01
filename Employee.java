public class Employee {
    String name;
    int idNumber;
    String department;
    String position;
    public Employee(String name, int idNumber, String department, String position){
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }
    public Employee(String name, int idNumber){
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }
    public Employee(){
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }
    public String getName(){
        return this.name;
    }
    public int getIdNumber(){
        return this.idNumber;
    }
    public String getDepartment(){
        return this.department;
    }
    public String getPosition(){
        return this.position;
    }
    public void displayDat
}
