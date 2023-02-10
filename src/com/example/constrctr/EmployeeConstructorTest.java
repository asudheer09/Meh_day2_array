package com.example.constrctr;

public class EmployeeConstructorTest {
    public static void main(String[] args) {
        Employee employee= new Employee();
        // to access instance variables we use object-name.variable;
        System.out.println(employee.id);
        System.out.println(employee.name);
        System.out.println(employee.salary);

        Employee employee1= new Employee(123,"Meh",50000);
        System.out.println(employee1.id); //123
        System.out.println(employee1.name); //meh
        System.out.println(employee1.salary); //50000

        Employee employee2= new Employee(143,"sud");
        System.out.println(employee2.id);//143
        System.out.println(employee2.name);//sud
        System.out.println(employee2.salary);//0.0

    }
}

class Employee{

     int id; //0
     String name; // null
     double salary;//0.0

    Employee(){
        System.out.println("Employee: default constructor");
    }

    Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        System.out.println("Employee: parameterized constructor");
    }

    Employee(int id, String name){
        this.id=id;
        this.name=name;
        System.out.println("Employee: parameterized constructor");
    }

}
