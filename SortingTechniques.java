public class SortingTechniques {

    public static void printNums(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] nums) {
        int len = nums.length;
        boolean isSwapped = true;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSwapped = false;
                }
            }
            if (isSwapped)
                break;
        }
        printNums(nums);
    }

    public static void selectionSort(int nums[]) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        printNums(nums);
    }

    public static void main(String[] args) {
        int[] nums = { 10, 1, 45, 897, 3, 2, 14, 54, 23, 3, 5, 1, 0 };
        bubbleSort(nums);
        System.out.println();
        selectionSort(nums);
    }
}
