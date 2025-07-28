public class StringOperation {
    public static void main(String[] args) {
        String greet = "hello!! world";
        System.out.println("String: " +greet);
        int length = greet.length(); //lengh of str
        System.out.println("Length: " +length);
        String str1 = "Java";
        String str2 = "Programming";
        boolean result1 = str1.equals(str2);
        String result = str1.concat(str2);
        System.out.println(result);
        System.out.println(result1);
    }
}
