package otherTasks;

/*Create a arrSort() method of the MyUtils class to sort a two-dimensional integer array by descending the elements of the first column.
 In the case of equality of elements in the first column, the elements of the second column must be sorted in ascending order.
For example, for a given array
        1 2 3
        1 4
        3 2
        3 3 5
        you should get
        3 2
        3 3 5
        1 2 3
        1 4*/

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {
    // Code
    public int[][] arrSort(int[][] arr) {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1.length == 0) {
                    return 1;
                }
                if (o2.length == 0) {
                    return -1;
                }
                if (o1[0] < o2[0]) {
                    return 1;
                } else if (o1[0] == o2[0]) {
                    if (o1.length > 1 && o2.length > 1) {
                        return o1[1] - o2[1];
                    } else {
                        if (o1.length > o2.length) {
                            return 1;
                        } else {
                            return -1;
                        }
                    }

                } else {
                    return -1;
                }
            }
        });
        return arr;
    }
}