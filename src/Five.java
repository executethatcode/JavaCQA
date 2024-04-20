import java.util.ArrayList;
import java.util.Collections;

public class Five {
    public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
        System.out.println("Original ArrayList:");
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println("\nReversed ArrayList:");
        System.out.println(numbers);
    }
    
}
