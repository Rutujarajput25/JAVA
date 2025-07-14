public class Constructor2 {
    public String name;
    Constructor2() {
        System.out.println("Constuctor is called");
        name = "Programming";
    }
    public static void main(String[] args) {
        Constructor2 obj = new Constructor2();
        System.out.println("Te name is " +obj.name);
    }
    
}
