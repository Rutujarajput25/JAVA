
import java.util.Scanner;
public class UseInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER 1ST NO: ");
        float firstNumber = obj.nextFloat();
        System.out.println("ENTER 2ND NO: ");
        double secondNumber = obj.nextDouble();
        obj.nextLine(); //clears the leftover new line
        System.out.println("ENTER UR NAME");
        String name = obj.nextLine(); //include blankspaces as well and next only include 1st word
        System.out.println("U entered: " +firstNumber);
        System.out.println("U entered: " +secondNumber);
        System.out.println("U entered: " +name);
        obj.close();
    }

    
}
/*
 * this is a muliine comment
 */