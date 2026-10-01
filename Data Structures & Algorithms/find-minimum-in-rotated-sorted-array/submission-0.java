class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int middle = (left + right) / 2;
        while (right > left) {
            if (nums[middle] > nums[right]) {
                // search right
                left = middle + 1;
            } else {
                // search left
                right = middle;
            }
            middle = (left + right) / 2;
        }
        return nums[left];
    }
}
