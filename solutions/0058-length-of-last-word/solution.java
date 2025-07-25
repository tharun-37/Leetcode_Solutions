class Solution {
    public int lengthOfLastWord(String s) {
        String st[]=s.split(" ");
        int c=0;
        for(int i=0;i<st[st.length-1].length();i++){
            c++;
        }return c;
    }
}
