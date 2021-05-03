package JavaDrills.InheritanceDrills;

public class StudentRunner {
    public static void main(String[] args) {
        //Student student = new Student();
        Employee employee = new Employee("Angel", "Data Programmer");
        //employee.setName("Angel");
        employee.setEmail("alicea@rider.edu");
        employee.setEmployeeGrade("A");
        employee.setEmployer("TD Bank");
        //employee.setTitle("Data Programmer");
        System.out.println(employee);

    }
}
