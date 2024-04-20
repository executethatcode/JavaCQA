import java.util.HashMap;

public class TwentyTwo {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Maths", 96);
        hashMap.put("Hindi", 78);
        hashMap.put("English", 87);
        hashMap.put("Science", 67);
        System.out.println(hashMap);

        System.out.println("No. of key-value elements in Map  : "+ hashMap.size());
    }
    
}
