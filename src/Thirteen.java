import java.util.LinkedList;

public class Thirteen {
    public static void main(String[] args) {
         LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        } 

        LinkedList<Integer> listB = new LinkedList<>();
        for (int i = 0; i < 10; i = i+1) {
            listB.add(i);
        } 
        boolean result = list.equals(listB);
        if(result)
            System.out.println("Equal Linked List");
        else
            System.out.println("Not Equal");    

    }
    
}
