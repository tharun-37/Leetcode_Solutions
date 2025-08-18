class Solution {
    public String intToRoman(int num) {
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] syb = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder romanNum = new StringBuilder();
        
        int i = 0;
        while (num > 0) {
            int count = num / val[i];
            
            for (int j = 0; j < count; j++) {
                romanNum.append(syb[i]);
            }
            
            num %= val[i];
            
            i++;
        }
        
        return romanNum.toString();
    }
}
