class Data{
    private int age;

    public int getage() {
        return this.age;

    }
    public void setage(int a){
        this.age = a;
    }


}

public class Gettersetter {
    public static void main(String[] args) {
        Data d = new Data();
        d.setage(25);
        System.out.println(d.getage());


    }
    

    }
