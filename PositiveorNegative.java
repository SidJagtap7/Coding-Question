import java.sql.SQLOutput;
import java.util.Scanner;

class PositiveorNegative{
    public static void main(String [] args){
        Scanner  sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int N =sc.nextInt();

        if(N>0){
            System.out.println("Number is Positive");

        }else{
            System.out.println("Number is Negative");
        }

    }
}