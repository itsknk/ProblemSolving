# Since the positions are specified, separate both colors and rods(numbers). Make a set of rods with colors not repeating and numbers assigned.
class Solution:
    def countPoints(self, rings: str) -> int:
        if 'R' not in rings or 'G' not in rings or 'B' not in rings:
            return 0
        rods = {}
        for i in range(0, len(rings), 2):
            color = rings[i]
            number = int(rings[i+1])
            if color not in rods:
                rods[color] = set()
            rods[color].add(number)

        ans = list(rods.values())
        return len(set.intersection(*ans))




