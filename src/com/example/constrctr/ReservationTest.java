package com.example.constrctr;

public class ReservationTest {
    public static void main(String[] args) {
        Reservation reservation= new Reservation();

        reservation.setAddress("blr");
        reservation.setEmailId("abc@gmail.com");
        reservation.setName("Meh");
        reservation.setPhone(123456890L);

        System.out.println(reservation.getName());
        System.out.println(reservation.getEmailId());
        System.out.println(reservation.getPhone());
        System.out.println(reservation.getAddress());
    }
}
