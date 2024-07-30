import java.util.*;
public class class_specific1 {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        Set<Integer> hasSet=new HashSet<>(numbers);
        System.out.println("Hashset:" +hasSet);

        Set<Integer> linkedhasSet=new LinkedHashSet<>(numbers);
        System.out.println("linkedhasSet:" +linkedhasSet);

        Set<Integer> treeSet=new TreeSet<>(numbers);
        System.out.println("treeSet:" +treeSet);
    }
}
