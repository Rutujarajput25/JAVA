
class Father{
    Father(){
        System.out.println(" FATHER CLASS ");
    }
}
class Child extends Father{
    Child(){
        super();
        System.out.println(" CHILD CLASS ");
      //super(); it should in fitrst palce then it valid  
}
}


public class Superclassconstructor {
   public static void main(String[] args) {
      Child obj = new Child();
      Father obj1 = new Father();
        
   } 
}
