import java.util.HashMap;

public class TwentyFour {
    public static void main(String[] args) {
         HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Maths", 96);
        hashMap.put("Hindi", 78);
        hashMap.put("English", 87);
        hashMap.put("Science", 67);

        boolean checkEmpty = hashMap.isEmpty();
        if(checkEmpty)
        System.out.println("Map is empty");
        else
        System.out.println("Map is not Empty");
    }
    
}
