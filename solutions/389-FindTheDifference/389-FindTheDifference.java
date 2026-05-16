// Last updated: 5/16/2026, 10:16:47 PM
class Solution {
    public char findTheDifference(String s, String t) {
        int sumS = 0;
        int sumT = 0;
        for (char c : s.toCharArray()) {
            sumS += c;
        }
        for (char c : t.toCharArray()) {
            sumT += c;
        }
        return (char) (sumT - sumS);
    }
}