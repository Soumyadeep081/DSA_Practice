package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q9 {
    public static void main(String[] args) {
        //349. Intersection of Two Arrays:

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int m = input.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(intersection(a,b)));
    }

    public static int[] intersection(int[] num1, int[] num2) {
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(num1);
        Arrays.sort(num2);
        int i = 0, j = 0;
        while (i < num1.length && j < num2.length) {
            if (num1[i] == num2[j]) {
                arr.add(num1[i]);
                i++;
                j++;
            } else if (num1[i] < num2[j]) {
                i++;
            } else j++;
        }
        List<Integer> uniqueList = arr.stream().distinct().toList();

        int[] result = new int[uniqueList.size()];
        for (int k = 0; k < uniqueList.size(); k++) {
            result[k] = uniqueList.get(k);

        }
        return result;
    }
}
