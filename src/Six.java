import java.util.ArrayList;
import java.util.Collections;

public class Six {
    public static void main(String[] args) {
        ArrayList<String> colorArrayList = new ArrayList<>();
        colorArrayList.add("Violet");
        colorArrayList.add("Indigo");
        colorArrayList.add("Blue");
        colorArrayList.add("Green");
        colorArrayList.add("Yellow");
        colorArrayList.add("Orange");
        colorArrayList.add("Red");
        System.out.println("Arraylist : ");
        System.out.println(colorArrayList);
        Collections.swap(colorArrayList, 0, 4);
        System.out.println("\nAfter swapping Violet & Yellow, Modified array is : ");
        System.out.println(colorArrayList);
        
    }
    
}
