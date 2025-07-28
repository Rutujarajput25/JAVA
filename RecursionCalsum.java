 class RecursionCalsum {
  public  static int   calculatesum(int n) {
          if(n==1){
            return 1;
          }  
          else{
            return n + calculatesum( n - 1);
          }    
    }
    public static void main(String[] args) {
        int n = 5;
        int sum = calculatesum(n);
        System.out.println(sum);
    }

}