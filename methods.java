public class methods {


    // static int sum(int a,int b){
    //     return (a+b);
    // }


        int sum(int a,int b){
        return (a+b);
    }
    public static void main(String[] args){
        int a = 10;
        int b= 20;

        // int c = sum(a,b);
        // System.out.println("The sum is: "+ c);


        methods obj = new methods();
        int c = obj.sum(a, b);
        System.out.println("The sum is: "+ c);
    }
}
