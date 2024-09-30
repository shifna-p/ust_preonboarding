/*Write a Java program that takes a day of the week (as an integer from 1 to 7) as input and prints the name of the corresponding day.*/
//Introducing Switch Case

import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 to 7 to get the day : ");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid entry for day");
        }
    }
}
