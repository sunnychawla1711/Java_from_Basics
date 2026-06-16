import java.util.*;
public class ifelse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject 1");
        int m1 = sc.nextInt();
        System.out.println("Enter the marks of subject 2");
        int m2 = sc.nextInt();
        System.out.println("Enter the marks of subject 3");
        int m3 = sc.nextInt();
        int total = ((m1+m2+m3)/3);
        if(total >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33){
            System.out.println("You are Passed! ");
        }
        else{
            System.out.println("You are Failed! ");
        }
    }
}