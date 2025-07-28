public class Inheritance {
    public static void main(String[] args) {
        Dog labrador = new Dog();
        labrador.name = "BABUSHKA";
        labrador.display();
        labrador.eat();
        Animal a = new Animal();
        a.eat();
       // a.display(); parent class can't be inherited from child class
    }
}

    class Animal {
        String name;
        public void eat(){
        System.out.println(" I CAN EAT ");
    }
}
     class Dog extends Animal  {
        public void display(){
            System.out.println("MY NAME IS: " +name);
        }
    
    }
   