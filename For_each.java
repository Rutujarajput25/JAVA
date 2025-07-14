//for loop has an alternative syntax that makes it easy to iterate through arrays and collections
// syntax is change
//for(datatype item: arrayname){}
public class For_each {
    public static void main(String[] args) {
        int [] numbers = {3, 4,5,-5,0,12};
        int sum = 0;
        for(int number:numbers){
            sum += number;

        }
        System.out.println("SUM = " +sum);
    }
}
