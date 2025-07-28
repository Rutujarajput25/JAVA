public class InheritancewithSuper {
    public static void main(String[] args) {
        Dog labrador = new Dog();
        labrador.name = "BABUSHKA";
        labrador.display();
        labrador.eat();
        labrador.bark();
       // Animal a = new Animal();
       // a.eat();
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
        public void eat(){
            //call method of superclass
            super.eat(); //without this keyword if both class have same method the class for which obj will be created will be give priority i.e is called as overriding
            System.out.println(" I EAT ONLY DOG FOOD");
            // super.eat(); // if position is change the output sequence is change
        }
        public void bark(){
            System.out.println(" I CAN BARK ");
        }
    
    }