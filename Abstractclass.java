abstract class Language{
    abstract void display(); //abstract method

    public void demo(){
        System.out.println("hii");
 }
} 
class English extends Language{
    public void display(){ //all the child classes inherited from abstract superclass must provide the implementation for the abstract method
        System.out.println("welcome");
    }
}
class History extends Language{
    public void display(){
        System.out.println("WELCOME TO HISTORY");
    }
}
public class Abstractclass {
    public static void main(String[] args) {
        English obj = new English();
        obj.demo();
        obj.display();
        History obj1 = new History();
        obj1.display();
    }
}
