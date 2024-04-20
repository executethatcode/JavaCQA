import java.util.ArrayList;

public class Two {
     public static void main(String[] args) {
        ArrayList<String> colorArrayList = new ArrayList<>();
        colorArrayList.add("Violet");
        colorArrayList.add("Indigo");
        colorArrayList.add("Blue");
        colorArrayList.add("Green");
        colorArrayList.add("Yellow");
        colorArrayList.add("Orange");
        colorArrayList.add("Red");

        System.out.println("Original Array : " +colorArrayList);
        colorArrayList.add(0, "Navy Blue");
        System.out.println("Modified Array : " +colorArrayList);

    }
    
}
