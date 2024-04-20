import java.util.Arrays;
import java.util.HashSet;

public class Seventeen {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hashSet.add(i);
            
        }
        System.out.println(hashSet);
        Object[] arr = hashSet.toArray();
        System.out.println(Arrays.toString(arr));
        
    }
    
}
