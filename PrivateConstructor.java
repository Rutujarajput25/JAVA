class Test{
    //create privat econstructor
    private Test() {
        System.out.println("This is a private constructor");
    }
    public static void instanceMethod() {
        // create an instance of Test Class
        Test obj = new Test();
    }
}
public class PrivateConstructor {
    public static void main(String[] args) {
        //call the instanceMethod()
        Test.instanceMethod();
    }
}
