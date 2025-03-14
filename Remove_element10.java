import java.util.TreeSet;

public class Remove_element10{

    public static TreeSet<Integer> removeElementsLessThan(TreeSet<Integer> set, int threshold) {
        return new TreeSet<>(set.tailSet(threshold, true));
    }

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        int threshold = 3;

        TreeSet<Integer> result = removeElementsLessThan(set, threshold);

        System.out.println("Original set- " + set);
        System.out.println(threshold +""+ result);
    }
}

 