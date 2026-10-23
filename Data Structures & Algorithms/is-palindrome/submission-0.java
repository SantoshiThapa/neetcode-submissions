class Solution {
    public boolean isPalindrome(String s) {
        int l=0,n=s.length();
        int h=n-1;
        while(l<=h){
            while(l<h && !Character.isLetterOrDigit(s.charAt(l)))
            l++;
            while(l<h && !Character.isLetterOrDigit(s.charAt(h)))
            h--;
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(h)))
            return false;
            l++;
            h--;
        }
        return true;
    }
}
