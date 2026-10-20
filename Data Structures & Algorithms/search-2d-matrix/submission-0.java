class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // numbers are in non-decreasing order by row-major order
        int low = 0;
        int high = matrix.length * matrix[0].length - 1;
        boolean found = false;
        while (low <= high && !found) {
            int mid = (low + high) / 2;
            int row = mid / matrix[0].length;
            int col = mid % (matrix[0].length);
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid  - 1;
            }
        }
        return false;
    }
}
