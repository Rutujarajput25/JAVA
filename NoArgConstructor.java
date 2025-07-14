public class NoArgConstructor {
    int i;
    private NoArgConstructor() {
         i = 5;
        System.out.println("Constructor is called");
    }
    public static void main(String[] args) {
        NoArgConstructor obj = new NoArgConstructor();
        System.out.println("Value of i: " +obj.i);
    }
}
