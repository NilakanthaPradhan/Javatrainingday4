import java.util.*;
import java.util.HashSet;
import java.util.LinkedList;

class first_nonduplicte3 {
    public static int firstnonduplicate(LinkedList<Integer> list) {
        LinkedList<Integer> set = new LinkedList<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : list) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                duplicates.add(num);
            }
        }
        for (int num : set) {
            if (!duplicates.contains(num)) {
                return num;
            }
        }
        return 0;
    }
        public static void main (String[]args){
            LinkedList<Integer> numbers = new LinkedList<>();
            numbers.add(5);
            numbers.add(3);
            numbers.add(5);
            numbers.add(1);
            numbers.add(2);
            Integer result=firstnonduplicate(numbers);
            System.out.println(result);

        }
    }

