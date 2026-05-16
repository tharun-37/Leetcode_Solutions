// Last updated: 5/16/2026, 10:18:27 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        Arrays.sort(strs);
        String f=strs[0];
        String l=strs[strs.length-1];
        int len = Math.min(f.length(), l.length());
        for(int i=0;i<len;i++){
            if(f.charAt(i)==l.charAt(i)){
                ans=ans+strs[0].charAt(i);
            }
            else break;
        }
        return ans;
    }
}