public class StringDemo5 {
    public static void main(String[] args) {
        String s="could you maintain silence";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                count++;
            }
            else
            {
                continue;
            }
        }
        System.out.println(count);
    }
    
}
