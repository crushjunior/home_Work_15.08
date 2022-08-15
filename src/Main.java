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