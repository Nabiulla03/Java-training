


public class StringDemo { 
    public static void main(String[] args) {
         String s="Hello";
         System.out.println(s.length());
         String s1="Hello";
         System.out.println(s1.isBlank());
         String s2="ad";
         System.out.println(s2.length());
         System.out.println(s2.isEmpty());
         if(s1==s2){
                System.out.println("Equal");
            }
            else{
                System.out.println("Not Equal");
         }
    }
    
}
