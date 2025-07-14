public class MethodParameters {
    public void display1(){
        System.out.println("Method Without Parameter");
    }
    public void display2(int a){
        System.out.println("Method with a single parameter: " +a);
    }
    public static void main(String[] args) {
        MethodParameters obj = new MethodParameters();
        obj.display1();
        obj.display2(25);
    }
}
