import java.util.*;
public class exercise{
    public static float avg(int a, int b, int c ){
        return ((a+b+c)/3) ;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter 1st Number: ");
    int a = sc.nextInt();
    System.out.println("Enter 2nd Number: ");
    int b = sc.nextInt();
    System.out.println("Enter 3rd Number: ");
    int c = sc.nextInt();
    System.out.println("Average of 3 No. is : "+ avg(a,b,c));

    }
}
