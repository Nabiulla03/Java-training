import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            
            if (num % 2 == 0) {
                System.out.println(num + " is even.");5
            } else {
                System.out.println(num + " is odd.");
            }
        }
    }
}
