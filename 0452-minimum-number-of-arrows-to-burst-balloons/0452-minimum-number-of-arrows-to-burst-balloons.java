class Solution {
    public int findMinArrowShots(int[][] points) {
        int end=0;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int curr = points[0][1];
        int total = 0;
        for(int i=1;i<points.length;i++){
            if(curr>=points[i][0]){
                continue;
            }
            else{
                total++;
                curr = points[i][1];
            }
        }
        total++;
        return total;
    }
}