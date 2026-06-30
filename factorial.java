import java.util.*;

public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which factorial you want to print: ");
        int n = sc.nextInt();
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("Factorial of " + n + " is " + f);
    }
}
