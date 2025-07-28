public class This1 {
    int age;
    This1(int age){
        this.age = age; //if u dont use this it will create ambiguty
    }
    public static void main(String[] args) {
        This1 obj = new This1(25);
        System.out.println("obj.age = " +obj.age);
    }
}
