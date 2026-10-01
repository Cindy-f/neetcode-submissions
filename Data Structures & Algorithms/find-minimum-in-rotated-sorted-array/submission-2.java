class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int middle = (left + right) / 2;
        while (right > left) {
            if (nums[left] <= nums[right]) {
                return nums[left];
            }
            if (nums[middle] >= nums[left]) {
                // the rotation point must be to the right of middle
                left = middle + 1;
            } else {
                // nums[middle] <= nums[right]
                // the portion from middle to right is sorted
                // so the minium is either at middle or somewhat to its left
                right = middle;
            }
            middle = (left + right) / 2;
        }
        return nums[left];
    }
}
