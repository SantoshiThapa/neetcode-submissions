class Solution {
    public int missingNumber(int[] nums) {
        int s=0,n=nums.length;
        int t=n*(n+1)/2;
        for(int i=0;i<nums.length;i++)
        s+=nums[i];
        return t-s;
    }
}
