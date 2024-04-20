import java.util.LinkedList;

public class Eight {
    public static void main(String[] args) {
        LinkedList<String> colorLinkedList = new LinkedList<>();
        colorLinkedList.add("Violet");
        colorLinkedList.add("Indigo");
        colorLinkedList.add("Blue");
        colorLinkedList.add("Green");
        colorLinkedList.add("Yellow");
        colorLinkedList.add("Orange");
        colorLinkedList.add("Red");
        System.out.println("Linkedlist : ");
        System.out.println(colorLinkedList);
        colorLinkedList.addLast("Peach");
        System.out.println("Updated Linkedlist : ");
        System.out.println(colorLinkedList);
        
    }
    
}
