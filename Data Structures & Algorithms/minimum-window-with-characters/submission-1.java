class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
        return "";
        int f[]=new int[128];
        for(char c:t.toCharArray())
        f[c]++;
        int l=0,st=0,min=Integer.MAX_VALUE,count=t.length();
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            if(f[ch]>0)
            count--;
            f[ch]--;
            while(count==0){
                if(r-l+1<min){
                    min=r-l+1;
                    st=l;
                }
                char left=s.charAt(l);
                f[left]++;
                if(f[left]>0)
                count++;
                l++;
            }

        }
        return min==Integer.MAX_VALUE?"":s.substring(st,st+min);
    }
}
