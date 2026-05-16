// Last updated: 5/16/2026, 10:16:36 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}