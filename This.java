public class This {
    int instVar;
    This(int instVar){
        this.instVar = instVar;
        System.out.println(this.instVar);
        System.out.println("this reference = " +this);
    }
    public static void main(String[] args) {
        This obj = new This(25);
        System.out.println(obj.instVar);
        System.out.println("this reference = " +obj);

    }
}
