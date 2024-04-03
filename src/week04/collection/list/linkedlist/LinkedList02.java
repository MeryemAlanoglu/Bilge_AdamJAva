package week04.collection.list.linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedList02 {
    public static void main(String[] args) {
        Deque<String> animalList= new LinkedList<>();

        //Eleman ekleme
        animalList.add("Cow");
        System.out.println("LinkedList :"+animalList);
        animalList.addFirst("Dog");
        System.out.println("LinkedList after addFirst :"+animalList);

        //Son index eleman ekleme
        animalList.addLast("Cat");
        System.out.println("LinkedList after addLast :"+animalList);

        //ilk indexten eleman silme
        animalList.removeFirst();
        System.out.println("LinkedList after removerLast() :"+animalList);

        //son indexten eleman silme
        animalList.removeLast();
        System.out.println("LinkedList after removerLast() :"+animalList);
    }
}
