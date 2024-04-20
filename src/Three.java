import java.util.ArrayList;

public class Three {
     public static void main(String[] args) {
        ArrayList<String> colorArrayList = new ArrayList<>();
        colorArrayList.add("Violet");
        colorArrayList.add("Indigo");
        colorArrayList.add("Blue");
        colorArrayList.add("Green");
        colorArrayList.add("Yellow");
        colorArrayList.add("Orange");
        colorArrayList.add("Red");

        System.out.println(colorArrayList);
        System.out.print("Element at position 2 is : ");
        System.out.println(colorArrayList.get(2));


    }
    
}
