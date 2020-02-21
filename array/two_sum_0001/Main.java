package two_sum_0001;

public class Main {

    public static void main(String[] args) {
        Solution0 solution0 = new Solution0();
        Solution3 solution3 = new Solution3();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] result = solution3.twoSum(nums, target);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}
