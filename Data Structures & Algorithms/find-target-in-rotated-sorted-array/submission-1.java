class Solution {
    public int search(int[] a, int t) {
        int n=a.length;
        int l=0,h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(a[m]==t)
            return m;
            if(a[l]<=a[m]){
                if(a[l]<=t && t<a[m])
                h=m-1;
                else
                l=m+1;
            }
            else{
                if(a[m]<t && t<=a[h])
                l=m+1;
                else
                h=m-1;
            }
        }
        return -1;
    }
}
