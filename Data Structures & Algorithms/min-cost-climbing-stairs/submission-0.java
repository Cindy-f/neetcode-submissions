class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // create an array representing cumulative cost:
        int[] cumulativeCost = new int[cost.length + 1];
        cumulativeCost[0] = 0;
        cumulativeCost[1] = 0;
        for (int i = 2; i < cumulativeCost.length; i++) {
            cumulativeCost[i] = Math.min(cumulativeCost[i - 2] + cost[i - 2], cumulativeCost[i - 1] + cost[i - 1]);
        }
        return cumulativeCost[cumulativeCost.length - 1];
        
    }
}
