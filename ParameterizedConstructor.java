public class ParameterizedConstructor {
    String languages;
    //constructor accepting single value
    ParameterizedConstructor(String lang) {
        languages = lang;
        System.out.println(languages+ " git init\r\n" + //
                        "Progrraming language");
    }
    public static void main(String[] args) {
        ParameterizedConstructor obj1 = new ParameterizedConstructor("Java");
        ParameterizedConstructor obj2 = new ParameterizedConstructor("Python");
        ParameterizedConstructor obj3 = new ParameterizedConstructor("C");
        ParameterizedConstructor obj4 = new ParameterizedConstructor("C++");
    }
}
