# Last updated: 5/16/2026, 10:17:23 PM
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None
        nodes = []
        curr = head
        while curr:
            nodes.append(curr.val)
            curr = curr.next
        nodes.sort()
        curr = head
        for val in nodes:
            curr.val = val
            curr = curr.next  
        return head