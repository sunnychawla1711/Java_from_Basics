import java.util.*;
public class arrayUsingForEach {
    public static void main(String [] args){
        System.out.println("How many marks you want to enter: ");
        Scanner sc = new Scanner (System.in);
        int mar = sc.nextInt();
        int marks [] = new int[mar];
        for(int i=0;i<mar;i++){
            System.out.println("Enter marks "+ (i+1));
             marks[i] = sc.nextInt();
        }
        // for(int i=0;i<mar;i++){
        // System.out.println("Marks " + (i+1) +" is "+ marks[i]);
        // }


        for(int element: marks){
            System.out.println(element);
        }

    }
}
