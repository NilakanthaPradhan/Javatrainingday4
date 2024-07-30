import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class intersection8 {

    public static Set<Integer> findIntersection(List<Set<Integer>> sets) {
        if (sets == null || sets.isEmpty()) {
            return new HashSet<>();
        }

        Set<Integer> intersection = new HashSet<>(sets.get(0));
        for (int i = 1; i < sets.size(); i++) {
            intersection.retainAll(sets.get(i));
        }

        return intersection;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        Set<Integer> set3 = new HashSet<>();
        set3.add(3);
        set3.add(4);
        set3.add(5);

        List<Set<Integer>> sets = List.of(set1, set2, set3);

        Set<Integer> result = findIntersection(sets);

        System.out.println("Intersection of all sets: " + result); // Output: [3]
    }
}
 