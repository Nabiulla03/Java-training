import java.util.Scanner;
public class Factor{
public static void main(String[]args) {
    Scanner Sc = new Scanner(System.in);
    int n = Sc.nextInt();
    for (int i=2;i<n/2;i++){
      if(n%i==0)
{
        System.out.println(i+"");
     }       
   }
  }
}