class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,p=0;
        for(int pr:prices){
            min=Math.min(min,pr);
            p=Math.max(p,pr-min);
        }
        return p;
    }
}
