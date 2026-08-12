class Solution {
    static String longestPalindrome(String str) {
        if (str==null || str.length()==0){
            return "";
        }
        int idx=0;
        int max=1;
        for (int p=0;p<str.length();p++){
            int l1 = expand(str,p,p);
            int l2 = expand(str,p,p+1);
            int k = Math.max(l1,l2);
            if (k>max){
                max = k;
                idx = p-(k-1)/2;
            }
        }
        return str.substring(idx, idx+max);
    }
    static int expand(String s, int i, int j) {
        while (i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)) {
            i--;
            j++;
        }
        return j-i-1;
    }
}
