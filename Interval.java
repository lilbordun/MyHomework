import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        System.out.println("Hello! I propose you to enter the number from 0 to 100:");
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if (num >= 0 && num <= 14){
            System.out.println("Your number in interval [0 ; 14]");}
        else if (num >= 15 && num <= 35) {
            System.out.println("Your number in interval [15 ; 35]");}
        else if (num >= 36 && num <= 50) {
            System.out.println("Your number in interval [36 ; 50]");}
        else if (num > 50 && num <= 100) {
            System.out.println("Your number in interval [51 ; 100]");}
        else {
            System.out.println("Your number is out of any interval!");
        }



    }
    }


