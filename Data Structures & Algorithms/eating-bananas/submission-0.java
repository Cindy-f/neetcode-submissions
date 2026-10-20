class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        // Find the maximum pile size for the upper bound of our binary search:
        for (int pile: piles) {
            right = Math.max(right, pile);
        }
        int result = right;
        while (left <= right) {
            int k = left + (right - left) / 2;
            long totalHours = 0;
            for (int pile: piles) {
                totalHours += (long) (pile + k - 1) / k;
            }
            if (totalHours <= h) {
                result = k;     // Record valid speed
                right = k - 1;  // Try to find a smaller speed on the left
            } else {
                left = k + 1;   // Speed is too slow, look on the right
            }
        }
        return result;
    }
}
