

public class Arithmetic_Operator{
    public static void main(String[] args) {
        int a = 14, b = 5;
        int c = a/b; //Result of division
        float e = (float) a/b; //typecasting
        int d = a % b; //Remaider
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        float  f = 14.3f, g = 3.2f;
        float h = f%g;
         System.out.println(h);
         byte i = 10;
         short j = 15;
         int k = i+j; //result will be in int only
        System.out.println(k);
        float l = 12.5f;
        int m = 123;
        float n = l * m; //result in float
        System.out.println(n);
        float o = 12.5f;
        double p = 123;
        double q = o * p; //result in double
        System.out.println(q);
        char r = 40;
        int s = 30;
        int t = r - s;
        System.out.println(t);
        //precedence
        System.out.println(10+20/2); //giving  o/p has 20 which is wrong 
        //to change precedence add ()
        System.out.println((10 + 20)/2); //giving  o/p has 15 which is right


    }

}