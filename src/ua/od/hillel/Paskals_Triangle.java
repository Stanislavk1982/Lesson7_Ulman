package ua.od.hillel;

import java.util.Scanner;

/**
 * Created by Стивен on 12.04.2016.
 */
public class Paskals_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int number = scanner.nextInt();
        int[][] array_Paskal = new int[number][];
        array_Paskal[0] = new int[1];
        array_Paskal[1] = new int[2];
        array_Paskal[0][0] = 1;
        array_Paskal[1][0] = 1;
        array_Paskal[1][1] = 1;
        for (int i = 2; i < number; i++) {
            array_Paskal[i] = new int[i + 1];
            array_Paskal[i][0] = 1;
            array_Paskal[i][i] = 1;
            for (int j = 1; j < array_Paskal[i].length - 1; j++) {
                array_Paskal[i][j] = array_Paskal[i - 1][j - 1] + array_Paskal[i - 1][j];
            }
        }
        System.out.println("Pascal's Triangle");
        Utils.printArray(array_Paskal);

    }
}
