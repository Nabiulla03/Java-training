import java.util.Scanner;

public class CountOfDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int count = countDivisors(num);
        System.out.println("Count of divisors: " + count);
    }

    public static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i * i != num) {
                    count += 2;
                } else {
                    count++;
                }
            }
        }
        return count;
    }
}

