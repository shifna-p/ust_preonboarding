//Product of 2 numbers

import java.util.Scanner;

public class ProductofNos {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.println("The product of "+ num1 +" and "+num2+ " is : "+num1*num2);

    }
}