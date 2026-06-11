import java.util.*;

public class switchStatement{
    public static void main(String[] args){
    System.out.println("Enter a character (m,t,w,th,f,s,su)");
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    switch(s){
        case "m" : System.out.println("Monday");
        break;
        case "t" : System.out.println("Tuesday");
        break;
        case "w" : System.out.println("Wednesday");
        break;
        case "th" : System.out.println("Thursday");
        break;
        case "f" : System.out.println("Friday");
        break;
        case "s" : System.out.println("Saturday");
        break;
        default : System.out.println("Sunday");
    }

    }
}
