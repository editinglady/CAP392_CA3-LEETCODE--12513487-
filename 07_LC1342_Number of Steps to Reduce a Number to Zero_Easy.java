class Solution {
    public int numberOfSteps(int num) {

        int count = 0;

        while (num > 0) {

            // Check if number is even
            if (num % 2 == 0) {
                num = num / 2;
            }

            // If number is odd
            else {
                num = num - 1;
            }

            count++;
        }

        return count;
    }
}