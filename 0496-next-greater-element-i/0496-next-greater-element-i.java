class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> s = new Stack<>();
        int n = nums2.length;
        int m = nums1.length;

        int[] nextGreater = new int[n];

        // Step 1: Find NGE for every element in nums2
        for (int i = n - 1; i >= 0; i--) {

            while (!s.empty() && nums2[s.peek()] <= nums2[i]) {
                s.pop();
            }

            if (s.empty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = nums2[s.peek()];
            }

            s.push(i);
        }

        // Step 2: Lookup nums1 elements in nums2
        int[] ans = new int[m];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (nums1[i] == nums2[j]) {
                    ans[i] = nextGreater[j];
                    break;
                }
            }
        }

        return ans;
    }
}