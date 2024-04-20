import java.util.ArrayList;
import java.util.Scanner;

public class Nine {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element to be added and it's position : ");
        String element = sc.nextLine();
        int pos = sc.nextInt();
        sc.close();

        if(pos <= colorArrayList.size()){
            colorArrayList.add(pos, element);
            System.out.println("Updated Arraylist : ");
            System.out.println(colorArrayList);
        }
    }
}