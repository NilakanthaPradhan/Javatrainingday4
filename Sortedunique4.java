import java.util.*;

public class Sortedunique4 {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        Set<Integer> treeset=new TreeSet<>(numbers);
        System.out.println(treeset);
    }
}
