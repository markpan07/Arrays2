import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        System.out.println("Task 1");
        int[] costs = generateRandomArray();
        int totalCost = 0;
        for (int i = 0; i < costs.length; i++) {
            totalCost = totalCost + costs[i];
        }
        System.out.println("Total costs are equal to " + totalCost);
    }

    private static void task2() {
        System.out.println("Task 2");
        int[] costs = generateRandomArray();
        int min = 201_000;
        int max = 0;
        System.out.println(Arrays.toString(costs));
        System.out.println();
        for (int i = 0; i < costs.length; i++) {
            if (costs[i] > max) {
                max = costs[i];
            } else if (costs[i] < min) {
                min = costs[i];
            }
        }
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
    }

    private static void task3() {
        System.out.println("Task 3");
        int[] costs = generateRandomArray();
        double averege;
        int totalCost = 0;
        for (int i = 0; i < costs.length; i++) {
            totalCost = totalCost + costs[i];
        }
        averege = (double) totalCost / costs.length;
        System.out.println("Total costs: " + totalCost);
        System.out.println("Total days: " + costs.length);
        System.out.printf("Averege is: %.2f", averege);
        System.out.println();
    }

    private static void task4() {
        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}