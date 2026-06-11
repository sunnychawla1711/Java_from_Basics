
import java.util.*;

public class arithmeticOperations{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("The Sum of Number 1 and Number 2 is " + (num1+num2));
        System.out.println("The Difference of Number 1 and Number 2 is " + (num1-num2));
        System.out.println("The Multiply of Number 1 and Number 2 is " + (num1*num2));
        System.out.println("The Division of Number 1 and Number 2 is " + (num1/num2));

    }
}
