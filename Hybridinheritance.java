//hybrid: combination of two or more tpes of inheritance
class Father{
    public  void demo(){
        System.out.println(" FATHER CLASS ");
    }
}
class Mother extends Father{
    public  void demo(){
        System.out.println(" MOTHER CLASS ");
        super.demo();
    }
}
class Child extends Mother{
    public  void demo(){
        System.out.println(" CHILD CLASS ");
        super.demo();
}
}
public class Hybridinheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.demo();
        
    }
}
