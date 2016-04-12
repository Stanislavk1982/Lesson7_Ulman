package ua.od.hillel;

/**
 * Created by Стивен on 11.04.2016.
 */
public class Utils {
    public static void printArray(int[][] array) {
        System.out.println("The resulted array");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j<array[i].length; j++) {
                if (j != 0)
                    System.out.print(", ");
                                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}

