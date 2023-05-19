//dynamic 1
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        for(int i=2; i<cost.length; i++){
            cost[i] += Math.min(cost[i-1],cost[i-2]);
        }
        return Math.min(cost[cost.length-1],cost[cost.length-2]);
    }
}

//dynamic 2
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a=0;
        int b=0;
        for(int i=cost.length-1; i>=0; i--){
            int curr = cost[i] + Math.min(a,b);
            a = b;
            b = curr;
        }
        return Math.min(a,b);
    }
}
