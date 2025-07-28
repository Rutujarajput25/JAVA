interface Polygon {
   void getArea(int length,int breadth);
    
}
class Rectangle implements Polygon{
    public void getArea(int length, int breadth){
        System.out.println(" The area of rectangle is:  " + (length * breadth));
    }
}
class Square implements Polygon{
    public void getArea(int length, int breadth){
        System.out.println(" The area of rectangle in suare class is:  " + (length * breadth));
    }
}

public class Interface {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(5, 6);
        Square s1 = new Square();
        s1.getArea(7, 5);
    }
    
}
