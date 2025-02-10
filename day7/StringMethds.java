public class StringMethds {
    public static void main(String[] args) {

        // ------------------ equalsIgnoreCase ( )-----------------
        String s = new String("ABC");
        String s2 = new String("abc");
        System.out.println(s.equalsIgnoreCase(s2));

        // ------------------ compareTo ( )-----------------
        // ASCII A = 97
        //       a = 65

        String s3 = new String("ABC");
        String s4 = new String("abc");
        System.out.println(s.compareTo(s2));

        // ------------------ compareToIgnoreCase ( )-----------------
        String s5 = new String("ABC");
        String s6 = new String("abc");
        System.out.println(s.compareToIgnoreCase(s2)); //a-A = 0 (After ignoring the case)

        // ------------------ startsWith ( )-----------------
        String s7 = new String("Please keep silence");
        System.out.println(s7.startsWith("Please", 8));
        System.out.println(s7.startsWith("Please"));
        
        // ------------------ endsWith ( )-----------------
        String s8 = new String("Please keep silence");
        System.out.println(s8.endsWith("Please"));
        System.out.println(s8.endsWith("e"));

        // ------------------ contentEquals ( )-----------------
        String s9 = new String("ABC");
        String st = new String("ABC");
        System.out.println(s9.contentEquals(st));

        // ------------------ equals ( )-----------------
        System.out.println(s9.equals(st));

        // ------------------ contains ( )-----------------
        String str = new String("ABC");
        System.out.println(str.contains("A"));
    }
}
