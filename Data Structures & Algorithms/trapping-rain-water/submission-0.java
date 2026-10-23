class Solution {
    public int trap(int[] h) {
        int n=h.length,c=0;
        int p[]=new int[n];
        int s[]=new int[n];
        p[0]=h[0];
        s[n-1]=h[n-1];
        for(int i=1;i<n;i++)
        p[i]=Math.max(p[i-1],h[i]);
        for(int i=n-2;i>=0;i--)
        s[i]=Math.max(s[i+1],h[i]);
        for(int i=0;i<n;i++){
            c+=Math.min(p[i],s[i])-h[i];
        }
        return c;
    }
}
