class Solution:
    def trap(self, height: List[int]) -> int:
        stack = []
        count = 0
        
        for i, h in enumerate(height):
            while stack and h > height[stack[-1]]:
                top = stack.pop()
                if not stack:
                    break
                distance = i - stack[-1] - 1
                bounded_height = min(h, height[stack[-1]]) - height[top]
                count += distance * bounded_height
            stack.append(i)
            
        return count
                        
                    
