//Write a Java program that determines if a given year is a leap year or not.

import java.util.Scanner;
public class NestedIfStmt {
    public String leap_year(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return "The year "+year+ " is leap year";
                }else{
                    return "The year "+year+ " is not a leap year";
                }
            }else{
                return "The year "+year+ " is a leap year"; //divisible by 4 but not by 100
            }
        }
        else{
            return "The year "+year+ " is a leap year";
        }
    }
    public static void main(String[] args){
        NestedIfStmt nf = new NestedIfStmt();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = sc.nextInt();
        System.out.println(nf.leap_year(year));
    }
}
