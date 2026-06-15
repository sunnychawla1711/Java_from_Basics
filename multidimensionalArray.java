import java.util.*;
public class multidimensionalArray {
    public static void main(String [] args){
        
        Scanner sc = new Scanner (System.in);
        System.out.println("How many rows you want to enter: ");
        int row = sc.nextInt();
        System.out.println("How many column you want to enter: ");
        int col = sc.nextInt();
        
        int arr [][] = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println("Enter the Element at position ("+(i+1)+","+(j+1)+")");
             arr[i][j] = sc.nextInt();
            }

        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                // System.out.println("Element at position ("+(i+1)+","+(j+1)+") is " + arr[i][j]);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
}
