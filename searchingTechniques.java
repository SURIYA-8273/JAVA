public class searchingTechniques {

    public static boolean linearSearch(int[] nums, int target) {

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (target == nums[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] nums, int target) {

        int len = nums.length;
        int start = 0;
        int end = len - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                return true;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = end - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50 };
        System.out.println(linearSearch(nums, 30));
        System.out.println(linearSearch(nums, 6));

        System.out.println(binarySearch(nums, 30));
        System.out.println(binarySearch(nums, 0));
    }
}
