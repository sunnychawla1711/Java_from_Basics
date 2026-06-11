import java.util.*;
public class ifElse{
    public static void vote(int a){
        if(a>18){
            System.out.println("You can vote : ");
        }
        else{
            System.out.println("You can't vote : ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int a = sc.nextInt();
        vote(a);

    }
}