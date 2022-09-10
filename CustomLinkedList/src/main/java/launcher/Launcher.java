package launcher;
import CustomLinkedList.CustomLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Launcher  {
    public static void main(String[] args) {
        CustomLinkedList<Integer> a = new CustomLinkedList<Integer>();
        CustomLinkedList<String> b = new CustomLinkedList<String>();

        b.addGroup("Vasya", "Dima", "Roma", "Nikita");

        b.print();
        System.out.println("-----------");
        b.removeByIndex(2);
        b.print();
        System.out.println("-----------");
        b.removeByValue("Vasya");
        b.print();
        System.out.println("-----------");

        System.out.println(b.getElementValueByIndex(0));
        System.out.println("-----------");
        b.replaceByIndex("Vladislav", 0);
        b.replaceByValue("Vladislav", "Dmytro");
        b.print();
        System.out.println("-----------");
        System.out.println(b.CheckElementPresenceByValue("Dmytro"));
    }
}