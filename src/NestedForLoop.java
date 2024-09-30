//Write a Java program to print a right-angled triangle pattern using asterisks (*). The number of rows should be specified by the user.
//Introducing Nested FOR LOOP

import java.util.Scanner;
public class NestedForLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();

        for(int i=1; i<=rows; i++ ){  //for rows
            for(int j =1; j<=i ; j++){  //for printing *
                System.out.print("*");
            }
            System.out.println();  //move to next line
        }
    }
}
