import java.util.*;
public class ifElseIfLadder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount of your Salary: ");
        float m1 = sc.nextFloat();
        if(m1 <= 250000){
            System.out.println("Your Salary is tax free! ");
        }
        else if (m1 > 250000 && m1 <= 500000){
            System.out.println("You have to pay Tax amount of " + ((5f/100f)*m1));
        }
        else if (m1 > 500000 && m1 <= 1000000){
            System.out.println("You have to pay Tax amount of " + ((20f/100f)*m1));
        }
        else {
            System.out.println("You have to pay Tax amount of " + ((30f/100f)*m1));
        }
    }
}









