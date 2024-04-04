package week04.collections.set.tree_set_example;

import java.util.TreeSet;

public class TreeSetExample08 {
        public static void main(String[] args) {
            TreeSet<Integer> evenNumbers = new TreeSet<>();
            evenNumbers.add(2);
            evenNumbers.add(4);
            System.out.println("TreeSet1: " + evenNumbers);// setlerin kesişimi

            TreeSet<Integer> numbers = new TreeSet<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            System.out.println("TreeSet2: " + numbers);

            // Intersection of two sets
            numbers.retainAll(evenNumbers);
            System.out.println("Intersection is: " + numbers);
        }
}
