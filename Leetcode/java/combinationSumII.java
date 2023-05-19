class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        combinations(candidates, 0, target, new ArrayList<Integer>(),  res);
        return res;
    }
    public void combinations(int[] can, int pos, int target, List<Integer> curr, List<List<Integer>> res)
    {
        if(target == 0)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target < 0)
        {
            return;
        }
        for(int i=pos; i<can.length; i++)
        {
            if(i==pos || can[i]!=can[i-1])
            {
                curr.add(can[i]);
                combinations(can, i+1, target-can[i], curr, res);
                curr.remove(curr.size()-1);
            }
        }
    }
}
