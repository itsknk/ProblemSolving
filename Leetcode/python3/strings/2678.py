class Solution:
    def countSeniors(self, details: List[str]) -> int:
        count = 0
        age= [age[11:13] for age in details]
        for i in age:
            if int(i) > 60:
                count = count+1
        return count
