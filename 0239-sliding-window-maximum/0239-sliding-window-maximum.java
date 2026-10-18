import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> q = new LinkedList<>();

        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int index = 0;

        for (int i = 0; i < n; i++) {

            // Remove elements outside the window
            while (!q.isEmpty() && q.peekFirst() <= i - k) {
                q.pollFirst();
            }

            // Remove smaller elements from the back
            while (!q.isEmpty() && nums[q.peekLast()] <= nums[i]) {
                q.pollLast();
            }

            // Add current index
            q.offerLast(i);

            // Window is of size k
            if (i >= k - 1) {
                ans[index] = nums[q.peekFirst()];
                index++;
            }
        }

        return ans;
    }
}