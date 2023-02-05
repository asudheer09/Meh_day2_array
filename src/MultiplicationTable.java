import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter a number to print multiplication");
        int input= scanner.nextInt();

        for (int i = 1; i <=10; i++) {
            System.out.println(input+" X "+i+" = "+(input*i));
            //10X1=10
        }
    }
}
