import java.util.LinkedList;

public class Eleven {
    public static void main(String[] args) {
        LinkedList<String> colorLinkedList = new LinkedList<>();
        colorLinkedList.add("Violet");
        colorLinkedList.add("Indigo");
        colorLinkedList.add("Blue");
        colorLinkedList.add("Green");
        colorLinkedList.add("Yellow");
        colorLinkedList.add("Orange");
        colorLinkedList.add("Red");
        
        for (int i = 0; i < colorLinkedList.size(); i++) {
            System.out.println("Element at pos : " + i + " : ");
            System.out.println(colorLinkedList.get(i));
            
        }
     
        
    }
}
