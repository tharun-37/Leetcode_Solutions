# Last updated: 5/16/2026, 10:18:02 PM
class Solution:
    def multiply(self, num1: str, num2: str) -> str:
        val1 = 0
        for digit in num1:
            val1 = val1 * 10 + (ord(digit) - ord('0'))
            
        val2 = 0
        for digit in num2:
            val2 = val2 * 10 + (ord(digit) - ord('0'))
            
        return str(val1 * val2)