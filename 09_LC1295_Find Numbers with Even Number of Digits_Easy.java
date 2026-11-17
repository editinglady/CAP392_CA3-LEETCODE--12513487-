class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int digits = 0;

            // Count the number of digits
            while (num > 0) {
                digits++;
                num = num / 10;
            }

            // Check if digits are even
            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}