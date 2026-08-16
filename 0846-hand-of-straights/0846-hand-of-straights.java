class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize!=0) return false;
        Arrays.sort(hand);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int card : hand){
            map.put(card,map.getOrDefault(card,0)+1);
        }
        for(int i=0;i<hand.length;i++){
            if(map.get(hand[i])==0) continue;
            for(int j=0;j<groupSize;j++){
                int num = j+hand[i];
                if(map.getOrDefault(num,0)==0) return false;
                map.put(num,map.get(num)-1);
            }
        }
        return true;
    }
}