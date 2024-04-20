import java.util.TreeSet;

public class Twenty {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(45);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(102);
        TreeSet<Integer> treeSetB = new TreeSet<>();
        for (Integer integer : treeSet) {
            if (integer < 7) {
                treeSetB.add(integer);
            }
        }
        System.out.println(treeSetB);
            
        }
    }
    

