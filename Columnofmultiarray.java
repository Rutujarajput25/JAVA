public class Columnofmultiarray {
    public static void main(String[] args) {
        int[] [] a = {
            {1,-2,3},
            {-4,-5,6,9},
            {7}
        };
        for(int j =0; j < a[0].length; j++) {
            for(int i = 0 ; i < a.length; i++) {
                System.out.println(a[i][j]);
            }
        }
    }
    
}
