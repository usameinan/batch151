package day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");

        wareHouse.remove();
        System.out.println(wareHouse);

        System.out.println(wareHouse.peek());
        System.out.println(wareHouse);

        System.out.println(wareHouse.element());
        System.out.println(wareHouse);

        System.out.println(wareHouse.poll());
        System.out.println(wareHouse);

        wareHouse.clear();

        System.out.println(wareHouse.poll());
        System.out.println(wareHouse.remove());




    }//main
}//class
