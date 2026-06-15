import java.util.*;
public class one{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject one: ");
        int m1 = sc.nextInt();
        System.out.println("Enter the marks of subject two: ");
        int m2 = sc.nextInt();
        System.out.println("Enter the marks of subject three: ");
        int m3 = sc.nextInt();
        System.out.println("Enter the marks of subject four: ");
        int m4 = sc.nextInt();
        System.out.println("Enter the marks of subject five: ");
        int m5 = sc.nextInt();
        System.out.println("Your percentage is: " + ((m1+m2+m3+m4+m5)/5) );

    }
}