import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setoperation6{

    public static boolean isSubset(Set<?> setA, Set<?> setB) {
        return setB.containsAll(setA);
    }

    public static void main(String[] args) {

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();


        setA.add(1);
        setA.add(2);
        setA.add(3);


        setB.add(1);
        setB.add(2);
        setB.add(3);
        setB.add(4);


        System.out.println("Using HashSet:");
        System.out.println("Is setA a subset of setB? " + isSubset(setA, setB)); // true


        setA = new LinkedHashSet<>();
        setB = new LinkedHashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);

        setB.add(1);
        setB.add(2);
        setB.add(3);
        setB.add(4);

        System.out.println("Using LinkedHashSet:");
        System.out.println("Is setA a subset of setB? " + isSubset(setA, setB)); // true


        setA = new TreeSet<>();
        setB = new TreeSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);

        setB.add(1);
        setB.add(2);
        setB.add(3);
        setB.add(4);

        System.out.println("Using TreeSet:");
        System.out.println("Is setA a subset of setB? " + isSubset(setA, setB)); // true
    }
}
