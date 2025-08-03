
import java.util.Scanner;
import java.lang.*;
public class Area_Of_Triangle {
    public static void main(String[] args) {
        //Create Scanner object
        Scanner scanner = new Scanner(System.in);
        //Taking input
        System.out.print("Enter Base: ");
        float base = scanner.nextFloat();
        System.out.print("Enter Height: ");
        float height = scanner.nextFloat();
        float Area = 1/2 * base * height;
        System.out.println("AREA OF TRIANGLE IS: " +Area);
        
        //AREA OF TRAINGLE BY SIDE
        System.out.println("Enter three sides");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        float s = (a+b+c) / 2f;
        double areais =  Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("AREA IS:" +areais);
        scanner.close();
    }

    
}
