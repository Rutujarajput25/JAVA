import java.util.Scanner;
public class Roots_of_Quadratic_Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a,b,c; ");
        int  a = scanner.nextInt();
        int  b = scanner.nextInt();
        int  c = scanner.nextInt();
        double r1, r2;
        r1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        r2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("ROOT ARE: "+r1+" " +r2);
        scanner.close();
    }
    
}
