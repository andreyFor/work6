

import java.util.Arrays;

public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();


        System.out.println("Задание номер 1");
        int spendingPermonth = 0;
        for (int i : arr){
            spendingPermonth += i;
        }
        System.out.println("сумма трат за месяц составила " + spendingPermonth + " рублей");
        System.out.println("задание номер 2");

        int maxSpending = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSpending) {
                maxSpending = arr[i];

            }

        }
        System.out.println("максимальная сумма трат за день составила " + maxSpending + " рублей");
        int minSpending = 5000000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSpending){
                minSpending = arr[i];
            }

        }
        System.out.println("минимальная сумма трат за день составила " + minSpending + " рублей");
        System.out.println("Задание номер 3");
        float amountOfDays = 31;
        float averageSpending = spendingPermonth / amountOfDays ;
        System.out.println("средняя сумма трат за месяц составила " + averageSpending + " рублей");
        System.out.println("Задание номер 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }















    }
}