package yusufgun.LinearAndBinarySearchExample;

public class Demo {

    // Sınıf seviyesinde, recursive metot için global sayaç
    static int binarySteps = 0;

    public static void main(String[] args) {
        // Linear Search ve Binary Search algoritmalarını karşılaştırmak için bir örnek
        int nums[] = new int[1000];
        int target = 900;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        System.out.println("--- LINEAR SEARCH ---");
        int result1 = linearSearch(nums, target);

        if (result1 != -1)
            System.out.println("Element found at Index: " + result1);
        else
            System.out.println("Element not found");

        System.out.println("\n--- BINARY SEARCH ---");
        int result2 = binarySearch(nums, target, 0, nums.length - 1);

        if (result2 != -1)
            System.out.println("Element found at Index: " + result2);
        else
            System.out.println("Element not found");
    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps taken by Linear: " + steps);
                return i;
            }
        }
        System.out.println("Steps taken by Linear: " + steps);
        return -1;
    }

    public static int binarySearch(int[] nums, int target, int left, int right) {
        // Metot her kendi kendini çağırdığında sayacı artırır, sıfırlanmaz
        binarySteps++;

        if (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                System.out.println("Steps taken by Binary: " + binarySteps);
                return mid;
            } else if (nums[mid] < target) {
                return binarySearch(nums, target, mid + 1, right);
            } else {
                return binarySearch(nums, target, left, mid - 1);
            }
        }
        return -1;
    }
}