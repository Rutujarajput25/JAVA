class Animal{
    public static void demo(){
        System.out.println("I'M A ANIMAL CLASS GRANDPARENT");
    }
}
class Dog extends Animal{
    public static void demo1(){
        System.out.println("I'M DOG CLASS PARENT");
    }
}
class Labrador extends Dog {
    public static void demo2(){
        System.out.println("I'M LABRAODOR CLASS CHILD CLASS");
}
}
public class Multilevelinheritance {
    public static void main(String[] args) {
        Labrador obj = new Labrador();
        obj.demo();
        obj.demo1();
        obj.demo2();
    }
    
}
