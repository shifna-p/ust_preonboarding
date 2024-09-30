/*Write a Java program that takes a student's score (0-100) as input and uses an else if statement to determine and print the corresponding grade:

A for 90 and above,
B for 80 to 89,
C for 70 to 79,
D for 60 to 69,
F for below 60.*/


import java.util.Scanner;
public class ElseIfStmt {
    public String grading(int score){
        String grade;
        if(score >=90){
            grade = "A grade";
        }
        else if( score >=80 && score <= 89){
           grade = "B grade";
        } else if ( score >=70 && score <= 79) {
           grade="C grade";
        }else if(score >= 60 && score <= 69){
            grade = "D grade";
        }else{
            grade ="F grade";
        }
        return grade;
    }
    public static void main(String[] args){
        ElseIfStmt r = new ElseIfStmt();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score of the child : ");
        int score = sc.nextInt();
        String result = r.grading(score);
        System.out.println("Grade of the student is : "+result);
    }
}
