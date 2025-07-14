import java.util.Scanner;
class Input{
    public static void main(String[] args) {
    
    
    Scanner input = new Scanner(System.in); //scanner class object is input here it is just a name of obj we can chnage it accordingly coming to new it is a keyword it is used for allocating memory
    System.out.print("Enter an integer");
    int number = input.nextInt();
    System.out.println("YOU ENTERED: " +number);
    input.close();
 }
}
