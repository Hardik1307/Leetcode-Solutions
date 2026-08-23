class Solution {
    public int largestInteger(int[] nums, int k) {
        int n  =nums.length;
            if (k == 1) {
            int ans = -1;

            for (int i = 0; i < n; i++) {
                boolean unique = true;

                for (int j = 0; j < n; j++) {
                    if (i != j && nums[i] == nums[j]) {
                        unique = false;
                        break;
                    }
                }

                if (unique) {
                    ans = Math.max(ans, nums[i]);
                }
            }

            return ans;
        }
        if(k==nums.length){
            int max = nums[0];
            for(int x : nums){
                if(x>max) max= x;
            }
            return max;
        }
        boolean first = true;
        boolean last = true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[0]) first=false;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[nums.length-1]) last =false;
        }
        if(first&&last){
            return Math.max(nums[0],nums[nums.length-1]);
        }
        if(first) return nums[0];
        if(last) return nums[nums.length-1];
        return -1;
    }
}