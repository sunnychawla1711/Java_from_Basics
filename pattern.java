import java.util.*;

public class pattern {
    public static void main(String[] args) {

        // *****
        // *****
        // *****
        // *****

        int m = 5;
        int n = 4;
        // for(int i=0;i<n;i++){
        // for(int j=1;j<=m;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }



        // *****
        // *   *
        // *   *
        // *****
        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=m;j++){
        // if(i==1||j==1||i==n||j==m){
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }



        // *
        // **
        // ***
        // ****

        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }



        // ****
        // ***
        // **
        // *

        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=(n+1-i);j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }





        // *
        // **
        // ***
        // ****

        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=(n-i);j++){
        // System.out.print(" ");
        // }
        // for(int j=1;j<=(i);j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }





        // 1
        // 12
        // 123
        // 1234

        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=(i);j++){
        // System.out.print(j);
        // }

        // System.out.println();
        // }





        // 12345
        // 1234
        // 123
        // 12
        // 1

        // for(int i=1;i<=m;i++){
        // for(int j=1;j<=m+1-i;j++){
        // System.out.print(j);
        // }

        // System.out.println();
        // }


// 1
// 23
// 456
// 78910
// 1112131415


        // int num = 1;
        // for (int i = 1; i <= m; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(num);
        //         num++;
        //     }

        //     System.out.println();
        // }




// 1
// 01
// 101
// 0101
// 10101
  
   


        // for (int i = 1; i <= m; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         if((i+j)%2==0)
        //         System.out.print("1");
        //     else{
        //         System.out.print("0");
        //     }
                
        //     }

        //     System.out.println();
        // }




// 1
// 01
// 101
// 0101
// 10101

        //  for (int i = 1; i <= m; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         if((i+j)%2==0)
        //         System.out.print("1");
        //     else{
        //         System.out.print("0");
        //     }
                
        //     }

        //     System.out.println();
        // }





// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *





        //  for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //             System.out.print("*");
        //     }
        //     for (int j = 1; j <= 2*(n-i); j++) {
        //             System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //             System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        
        // for (int i = n; i>=1;i--) {
        //     for (int j = 1; j <= i; j++) {
        //             System.out.print("*");
        //     }
        //     for (int j = 1; j <= 2*(n-i); j++) {
        //             System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //             System.out.print("*");
        //     }
        //     System.out.println();
        // }



//     *****
//    *****
//   *****
//  *****
// *****

//         for (int i = 1; i <= m; i++) {
//             for (int j = 1; j <= (m-i); j++) {
//                     System.out.print(" ");
//             }
//             for (int j = 1; j <= m; j++) {
//                     System.out.print("*");
//             }
//                 System.out.println("");
//     }




//     1  
//    2 2  
//   3 3 3  
//  4 4 4 4  
// 5 5 5 5 5


// for(int i=0;i<=m;i++){
//     for(int j=1;j<=(m-i);j++){
//         System.out.print(" ");
//     }
//         for(int j=1;j<=(i);j++){
//         System.out.print(i + " ");
//     }
// System.out.println(" ");
// }



//     1 
//    212 
//   32123 
//  4321234 
// 543212345


// for(int i=0;i<=m;i++){
//     for(int j=1;j<=(m-i);j++){
//         System.out.print(" ");
//     }
//         for(int j=i;j>=1;j--){
//         System.out.print(j);
//     }
//             for(int j=2;j<=i;j++){
//         System.out.print(j);
//     }
// System.out.println(" ");
// }





//     * 
//    *** 
//   ***** 
//  ******* 
// ********* 
// ********* 
//  ******* 
//   ***** 
//    *** 
//     * 


// for(int i=0;i<=m;i++){
//     for(int j=1;j<=(m-i);j++){
//         System.out.print(" ");
//     }
//         for(int j=1;j<=(2*i)-(1);j++){
//         System.out.print("*");
//     }
// System.out.println(" ");
// }

// for(int i=m;i>=1;i--){
//     for(int j=1;j<=(m-i);j++){
//         System.out.print(" ");
//     }
//         for(int j=1;j<=(2*i)-(1);j++){
//         System.out.print("*");
//     }
// System.out.println(" ");
// }



}
}
