# (STACK) Take an empty list. If it's isn't empty and has the last element same as current in string, pop it. Else, add it at the end. Return the list as string.
class Solution:
    def removeDuplicates(self, s: str) -> str:
        dummy = []
        for i in s:
            if len(dummy) > 0 and dummy[-1] == i:
                dummy.pop()
            else:
                dummy.append(i)
        return "".join(dummy)
