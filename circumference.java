import java.util.*;
public class circumference{
    public static float circum(int r){
            return (2*3.14f*r);
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        int a = sc.nextInt();
        System.out.println("Circumference of circle is: "+ circum(a));

    }
}
