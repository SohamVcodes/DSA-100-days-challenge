class Solution {

    public int isPossible(int[] nums, int mid) {

        int count = 1;
        int tempSum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (tempSum + nums[i] <= mid) {
                tempSum += nums[i];
            } else {
                count++;
                tempSum = nums[i];
            }
        }

        return count;
    }

    public int splitArray(int[] nums, int k) {

        int low = 0;
        int high = 0;

        for (int i = 0; i < nums.length; i++) {
            low = Math.max(low, nums[i]);
            high += nums[i];
        }

        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int count = isPossible(nums, mid);

            if (count <= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}