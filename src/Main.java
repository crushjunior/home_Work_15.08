import java.util.*;
public class Main {
    public static void main(String[] args) {
    int[] arr = generateRandomArray();
    // Task 1
    int sumOfMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfMonth += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumOfMonth + " рублей.");
        System.out.println();
        // Task 2
        int minExpense = 1000000, maxExpense = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxExpense) {
                maxExpense = arr[i];
            }
            if (arr[i] <= minExpense ) {
                minExpense = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей. Максимальная сумма трат за день составила " + maxExpense + " рублей.");
        System.out.println();
        // Task 3
        double meanExpensive = (double) sumOfMonth / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + meanExpensive + " рублей.");
        System.out.println();
        // Task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

        System.out.println("\n");
        // Task 5
        int size = 3;
        int[][] matrix = new int[size][size];
        for (int i =0; i < size; i++) {
        matrix[i][i] = 1;
        matrix[i][size - i - 1] = 1;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();
        // Task 6
        int[] massiv = {5, 8, 2, 3, 9};
        int[] correctArray = new int[massiv.length];
            for (int i = massiv.length -1; i >= 0; i--) {
                correctArray[correctArray.length - i - 1] = massiv[i];
            }
        System.out.println(Arrays.toString(massiv));
        System.out.println(Arrays.toString(correctArray));
        System.out.println();
        // Task 7
        int ball = 0;
        System.out.println(Arrays.toString(massiv));
        for (int i = 0; i < massiv.length/2; i++) {
            ball = massiv[massiv.length - 1 -i];
            massiv[massiv.length - 1 -i] = massiv[i];
            massiv[i] = ball;
        }
        System.out.println(Arrays.toString(massiv));
        System.out.println();
        // Task 8
        int[] array8 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(array8);
        for (int i = 0; i < array8.length; i++) {
            if (array8[i] + array8[array8.length - 1 - i] == 2) {
                System.out.println(array8[i] + " " + array8[array8.length - 1 - i]);
                break;
            }
        }
        System.out.println();
        // Task 9
        for (int i = 0; i < array8.length; i++) {
            for (int j = array8.length -1; j >= 0; j--) {
                if (array8[i] + array8[j] == 2) {
                    System.out.println(array8[i] + " " +array8[j]);
                }
            }
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}