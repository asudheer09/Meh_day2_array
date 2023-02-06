 class Employee {
    int id;
    String name;
    float salary;
    static String company="HCL";

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +'\''+" company = "+company+
                '}';
    }
}

public class EmployeeTest{

    public static void main(String[] args) {
        Employee e1= new Employee(1,"meh",30000);
        Employee e2= new Employee(2,"sud",20000);

        System.out.println(e1);
        System.out.println(e2);

        System.out.println(Employee.company);//using class name printing static variable
        System.out.println(e1.company);//using class name printing static variable

    }
}
 