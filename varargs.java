public class varargs{


    // public static int sum(int a){
    //     return a;
    // }
    // public static int sum(int a,int b){
    //     return a+b;
    // }
    // public static int sum(int a,int b,int c){
    //     return a+b+c;
    // }

    public static int sum(int ...arr){
        int res = 0;
        for(int a: arr){
            res = res+a;
        }
        return res;
    }


    public static void main(String [] args){
        int a = 10;
        int b= 20;
        int c = 30;
        int d = 40;
        int e = 50;
        
        
        System.out.println("The sum of a is "+sum(a));
        System.out.println("The sum of a and b is "+sum(a,b));
        System.out.println("The sum of a,b and c is "+sum(a,b,c));
        System.out.println("The sum of a,b,c and d is "+sum(a,b,c,d));
        System.out.println("The sum of a,b,c,d and e is "+sum(a,b,c,d,e));

    }
}