//this wit getter and setter
public class This2 {
    String name;
    //setter method
    void setName(String name) {
        this.name = name;
    }
    //getter method
    String getName(){
        return this.name;
    }
    public static void main(String[] args) {
        This2 obj = new This2();
        //callling the setter and the getter method
        obj.setName("Rutuja");
        System.out.println("obj.name: " +obj.getName());
    }
    
}
