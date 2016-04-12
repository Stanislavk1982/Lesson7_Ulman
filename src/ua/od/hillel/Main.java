package ua.od.hillel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[][] array_Ulam = new int[7][7];
        System.out.println("Test" +array_Ulam[1][1]);
        array_Ulam = input_array(array_Ulam);
        int i = array_Ulam.length / 2, j = array_Ulam[0].length / 2 + 1;
        int counter = 2;
        String direction = "r";
        // array_Ulam[0][1] = 9;
        array_Ulam[3][3] = 1;
        while (counter < 50) {
            //array_Ulam[3][3] = 1;
            switch (direction) {
                case "r":
                    array_Ulam[i][j] = counter;
                    if (array_Ulam[i - 1][j] == 0) {
                        direction = "u";
                        i--;
                    } else {
                        j++;
                    }
                    break;
                case "u":
                    array_Ulam[i][j] = counter;
                    if (array_Ulam[i][j - 1] == 0) {
                        direction = "l";
                        j--;
                    } else {
                        i--;
                    }
                    break;
                case "l":
                    array_Ulam[i][j] = counter;
                    if (array_Ulam[i + 1][j] == 0) {
                        direction = "d";
                        i++;
                    } else {
                        j--;
                    }
                    break;

                case "d":
                    array_Ulam[i][j] = counter;
                    if (array_Ulam[i][j + 1] == 0) {
                        direction = "r";
                        j++;
                    } else {
                        i++;
                    }
                    break;

            }
            counter++;
        }


        System.out.println(counter);
        Utils.printArray(array_Ulam);
    }

    public static int[][] input_array(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0;
            }
        }
        return array;
    }


}
