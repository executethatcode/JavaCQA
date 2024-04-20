import java.util.HashSet;

public class Eighteen {
    public static void main(String[] args) {
        HashSet<Integer> hashSetA = new HashSet<>();
        for (int i = 0; i < 10; i=i+1) {
            hashSetA.add(i);
            
        }
        HashSet<Integer> hashSetB = new HashSet<>();
        for (int i = 0; i < 10; i=i+2) {
            hashSetB.add(i);
            
        }
        System.out.println("Set A: " + hashSetA);
        System.out.println("Set B: " + hashSetB);


        hashSetA.retainAll(hashSetB);
        System.out.println("Common elements : " +hashSetA);
        
    }
    
}
