import java.util.LinkedList;

public class Twelve {
    public static void main(String[] args) {
        boolean boolnotfound = true;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        } 
        int element = 25;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == element) {
                boolnotfound = false;
                break;
            }
        }
        if (boolnotfound) 
            System.out.println("Not found");
        else
        System.out.println("found found");

    }
    
}
