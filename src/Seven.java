import java.util.ArrayList;

public class Seven {

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
        for (int i = 0; i < colorArrayList.size(); i++) {
            System.out.print(" \nElement at Pos: " + i + " : ");
            System.out.print(colorArrayList.get(i));
            
        }
    }
}
    

