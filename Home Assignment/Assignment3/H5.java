package Assignment3;
import java.util.Scanner;
public class H5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String n = sc.next();
        try {
            int num = Integer.parseInt(n);
            try {
                if(num<0){
                    throw new ArithmeticException("Square root of a negative number is not possible!");
                }
                System.out.println("Square root of "+num+" is: "+Math.sqrt(num));
            }
            catch (ArithmeticException e){
                System.err.println(e.getMessage());
            }
        }
        catch (NumberFormatException e){
            System.err.println("Enter a valid number");
        }
    }
}

