package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        double[] massive = {2.1, 1.1, -1.4, 1.7, 2.4, -3.1, 3.5, 3.8, -2.5, 4.7, -2.3, 2.5, 1.6, 4.2, -3.9};
        double result = 0;
        int kol = 0;
        boolean otr = false;

        for (double d : massive) {
            if (d < 0) {

                otr = true;

            } else {
                if (otr)
                    kol++;
                result += d;
            }
        }
        System.out.println("среднее орифметическое " + result / kol);
        int[] array = new int[]{3, 1, -2, -4, 5, -5};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
