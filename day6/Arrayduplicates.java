import java.util.HashSet;
import java.util.Set;

public class Arrayduplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 1};
        findDuplicates(array);
    }

    public static void findDuplicates(int[] array) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}