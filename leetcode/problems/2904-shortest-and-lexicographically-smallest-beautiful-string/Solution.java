class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') num.add(i);
        }
        int minlen=101;
        String ans = "";
        for(int i=0;i<=num.size()-k;i++){
            int start = num.get(i);
            int last = num.get(i+k-1);
            int len = last - start+1;
            String curr = s.substring(start,last+1);
            if(len<minlen||(len==minlen&&curr.compareTo(ans)<0)){
                minlen=len;
                ans=curr;
            }
        }
        return ans;
    }
}