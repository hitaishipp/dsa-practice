import java.util.*;
public class first{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        float r = sc.nextFloat();
        double area = 3.14*r*r;
        System.out.println("the area of the circle is " + area);
        sc.close();
    }

}