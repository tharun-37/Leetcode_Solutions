class Solution {
    public boolean isHappy(int n) {
        int[] list = new int[100];
        int j = 0;
        while (n != 1) {
            int sum = 0;
            while (n > 0) {
                sum += (n%10)*(n%10);
                n /= 10;
            }
            for (int i = 0; i < j; i++) {
                if (list[i] == sum) return false;
            }
            list[j++] = sum;
            n = sum;
        }
        return true;
    }
}
