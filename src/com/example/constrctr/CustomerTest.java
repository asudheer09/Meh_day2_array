package com.example.constrctr;

public class CustomerTest {
    public static void main(String[] args) {
        //Customer customer= new Customer(13,"abc","def","blr");
        Customer customer= new Customer();
        customer.setCustomerId(143);
        customer.setFirstName("Mehdiya");
        customer.setLastName("Khanum");
        customer.setAddress("Blr");

        System.out.println(customer.getCustomerId());
        System.out.println(customer.getFirstName());
        System.out.println(customer.getLastName());
        System.out.println(customer.getAddress());
    }

}
