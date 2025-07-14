public class Constructor {
    Constructor() {
        System.out.println("Hii I'm a Cnstructor My name is same as class and i get call by just creating a object");
    }
    public static void main(String[] args) {
        Constructor obj = new Constructor();
        //Constructor obj1 = new Constructor(); // it will print the statement inside constructor2 times
    }
    
}
