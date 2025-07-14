public class Method {
     public int addNumbers(int a, int b){
        int sum = a+b;
        return sum; //return is a keyword that we use if we want to pass a data from one method to another method this is calles as msg passing concept
    }
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;
        Method obj = new Method();  // 'Method' must match the class name exactly
        int result = obj.addNumbers(num1,num2); //calling method
        System.out.println("Sum is:" +result);
    }
}
