import java.util.Scanner;

public class reverseTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of table which you want to print in reverse order: ");
        int n = sc.nextInt();
        for(int i=10;i>=1;i--){
            System.out.println( n +" * "+ i + " = "+ (n)*(i));
        }
    }
}

