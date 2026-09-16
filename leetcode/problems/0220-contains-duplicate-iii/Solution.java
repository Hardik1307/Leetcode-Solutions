class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
                for(int x : set){
                    if(x>nums[i]+valueDiff) break;
                    if(x>=nums[i]-valueDiff) return true;
                }
            set.add(nums[i]);
            if(i>=indexDiff) set.remove(nums[i-indexDiff]);
        }
        return false;
    }
}