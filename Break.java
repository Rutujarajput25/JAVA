public class Break {
    public static void main(String[] args) {
        int i = 1, n =5;
        while (i <= n) {
            System.out.println(i);
            if(i==3){
               // break; //break will terminate loop when i = 3
                continue; //skip current iteration of loop
            }
            i++;
           // System.out.println(i);
            
        }
    }
}
