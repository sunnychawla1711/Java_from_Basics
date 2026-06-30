import java.util.*;
public class sumOfTable {
    public static void main(String[] args){





        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of table which sum you want: ");
        int n = sc.nextInt();
        int sum =0;
        for(int i=1;i<=10;i++){
            sum=sum+(n*i);    
        }
        System.out.println("Sum of occurence of table is: "+sum);


    }
    
}
