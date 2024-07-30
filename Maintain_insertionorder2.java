import java.util.*;

class Maintain_insertionorder2 {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        Set<String> linkedHash= new LinkedHashSet<>(fruits);
        System.out.println("Unique Fruits: " + linkedHash);
    }


    }
