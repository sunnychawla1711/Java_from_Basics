
    import java.util.*;
public class oddSum {
    public static int odd(int n){
        return n*n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many odd number you want to sum: ");
        int n = sc.nextInt();
        System.out.println("The sum is = "+odd(n));

    }
}

