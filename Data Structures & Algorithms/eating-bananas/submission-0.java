class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 0;

        // Maximum possible eating speed
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        // Binary search for minimum valid speed
        while (left < right) {

            int mid = left + (right - left) / 2;

            int hours = 0;

            // Calculate hours needed at speed 'mid'
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h) {
                // mid works, try a smaller speed
                right = mid;
            } else {
                // mid is too slow
                left = mid + 1;
            }
        }

        return left;
    }
}