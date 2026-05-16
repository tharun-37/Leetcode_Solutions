# Last updated: 5/16/2026, 10:17:27 PM
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        counts = {}
        for num in nums:
            counts[num] = counts.get(num, 0) + 1
            
        for key, value in counts.items():
            if value == 1:
                return key