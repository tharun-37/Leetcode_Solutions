class Solution:
    def isBalanced(self, num: str) -> bool:
        even, odd = 0, 0
        for i, val in enumerate(num):
            if i % 2 == 0:
                even += int(val)
            else:
                odd += int(val)
        return even == odd
