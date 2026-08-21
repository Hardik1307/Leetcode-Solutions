class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int ans = -1;

        for (int i = 0; i < n; i++) {

            int first = i;
            int last = i;

            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    first = Math.min(first, j);
                    last = Math.max(last, j);
                }
            }

            int start = Math.max(0, first - k + 1);
            int end = Math.min(last, n - k);

            int count = end - start + 1;

            if (count == 1) {
                ans = Math.max(ans, nums[i]);
            }
        }

        return ans;
    }
}