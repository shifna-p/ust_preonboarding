//Binary to decimal conversion

import java.util.Scanner;
public class BinaryToDecimalConversion {
    public int conversion(String binary){
        int conversion = 1;
        int result = 0;
        for(int i=1; i<=binary.length(); i++){
            if(binary.charAt(binary.length()-i)== '1')
                result +=conversion;
            conversion *=2;

        }
        return result;

    }
    public static void main(String[] args ){
        BinaryToDecimalConversion bd = new BinaryToDecimalConversion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String binary = sc.nextLine();
        int result = bd.conversion(binary);
        System.out.println("result is : " +result);
    }

}
