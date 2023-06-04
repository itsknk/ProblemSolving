# Take dictionary, use it to get position in the array and then match it to value.
class Solution:
    def countMatches(self, items: List[List[str]], ruleKey: str, ruleValue: str) -> int:
        count = 0
        dic = {"type":0, "color":1, "name":2}
        for item in items:
            if item[dic[ruleKey]] == ruleValue:
                count = count+1
        return count

# Same thing with if/else.
class Solution:
    def countMatches(self, items: List[List[str]], ruleKey: str, ruleValue: str) -> int:
        count=0
        if ruleKey=='type':
            index=0
        elif ruleKey=='color':
            index=1
        else:
            index=2
        for x in items:
                if ruleValue==x[index]:
                    count+=1
        return count

