import java.util.Scanner;
public class Number {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        int s=a*a;
        
        while (s>0) { 
            int rem=s%10;
            sum+=rem;
            s/=10;
        }
            System.out.println(sum);
    }
}
    

