//Write a Java program that determines if a given year is a leap year or not.
//Introducing nested IF

import java.util.Scanner;
public class NestedIf {
    public void leap_year(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("leap year");
                }else{
                    System.out.println("Not a leap year");
                }
            }else{
                System.out.println("Leap year"); //divisible by 4 but not by 100
            }
        }
        else{
            System.out.println("Not a leap year");
        }
    }
    public static void main(String[] args){
        NestedIf nf = new NestedIf();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check : ");
        int year = sc.nextInt();
        System.out.print("The year "+year+" is ");
        nf.leap_year(year);
    }
}
