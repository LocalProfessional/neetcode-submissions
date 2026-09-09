""" Concatenation of Array
    Sept 8th 2026
"""
__author__ = "Ahmad Saleh"

class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        ans = []
        for i in range(len(nums)):
            ans.append(nums[i])
        for j in range(len(nums)):
            ans.append(nums[j])
        return ans
