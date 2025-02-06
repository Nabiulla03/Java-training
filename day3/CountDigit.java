public class CountDigit {
    public static void main(String[] args) {
        int n=5678,count=0;
        while(n!=0){
            int rem=n%10;
            count++;
            n=n/100;
        }
            
      System.err.println(count);  

    }
}
