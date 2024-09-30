//Introducing IF ELSE Statement

import java.util.Scanner;
public class IFELSE {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a number :  ");
        int num = sc.nextInt();
        if(num >= 10){
            System.out.println("The number is greater or than equal to 10 ");
        }else{
            System.out.println("The number is less than 10");
        }
    }
}
