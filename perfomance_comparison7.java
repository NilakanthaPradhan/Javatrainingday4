import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class perfomance_comparison7
{

    private static final int ELEMENTS_COUNT = 1_000_000;

    public static void main(String[] args) {
        System.out.println("Testing HashSet:");
        testSetPerformance(new HashSet<>());

        System.out.println("Testing LinkedHashSet:");
        testSetPerformance(new LinkedHashSet<>());

        System.out.println("Testing TreeSet:");
        testSetPerformance(new TreeSet<>());
    }

    private static void testSetPerformance(Set<Integer> set) {
        long startTime, endTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            set.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time to add elements: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            set.contains(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time to check elements: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            set.remove(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time to remove elements: " + (endTime - startTime) + " ms");
        System.out.println();
    }
}
