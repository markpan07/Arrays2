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

    }

    private static void task2() {
        System.out.println("Task 2");

    }

    private static void task3() {
        System.out.println("Task 3");

    }

    private static void task4() {
        System.out.println("Task 4");
    }
}