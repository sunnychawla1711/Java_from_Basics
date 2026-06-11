import java.util.*;
public class cgpa {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first Marks: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second Marks: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third Marks: ");
        int num3 = sc.nextInt();
        System.out.println("CGPA is : "+ ((num1+num2+num3)/30));
    }
}
