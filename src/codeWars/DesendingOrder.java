package codeWars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DesendingOrder {
    public static Integer[] sortDesc(final int num) {
        //Your code
        String numbs = Integer.toString(num);
        List<Integer>arr = new ArrayList<>();
        for (int i = 0; i < numbs.length(); i++) {
            arr.add((int) numbs.charAt(i));
        }
         arr.sort(Comparator.naturalOrder());
        Integer[] array = arr.toArray(new Integer[0]);

        return array;
    }


}
