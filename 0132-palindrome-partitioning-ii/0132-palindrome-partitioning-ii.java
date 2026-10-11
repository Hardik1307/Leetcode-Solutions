class Solution {
    static int []dp;
    public int solve(int i,String s){
        if(i==s.length()){
            return 0;
        }
        if(dp[i]!=-1) return dp[i];
        int minPartition = Integer.MAX_VALUE;
        for(int j=i;j<s.length();j++){
            if(isPalindrome(i,j,s)){
                int Partition = 1+solve(j+1,s);
                minPartition = Math.min(minPartition,Partition);
            }
        }
        dp[i] = minPartition;
        return minPartition;
    }
    public int minCut(String s) {
        dp= new int[s.length()];
        Arrays.fill(dp,-1);

        return solve(0,s)-1;
        
    }
    public boolean isPalindrome(int left,int right,String s){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}