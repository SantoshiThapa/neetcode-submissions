class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> ans =new ArrayList<>();
        Arrays.sort(a);
        int n=a.length;
        for(int i=0;i<n-2;i++){
            if(i>0 && a[i]==a[i-1])
            continue;
            int s=i+1;
            int e=n-1;
            while(s<e){
                int su=a[i]+a[e]+a[s];
                if(su==0){
                    ans.add(Arrays.asList(a[i],a[s],a[e]));
                    s++;
                    e--;
                    while(s<e && a[s]==a[s-1])
                    s++;
                    while(s<e && a[e]==a[e+1])
                    e--;
                                    }
                else if(su>0){
                    e--;
                }
                else
                s++;
            }
        }
        return ans;
    }
}
