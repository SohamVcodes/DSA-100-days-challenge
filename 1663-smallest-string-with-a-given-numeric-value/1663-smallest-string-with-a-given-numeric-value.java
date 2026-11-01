class Solution {
    public String getSmallestString(int n, int k) {

        char[] ans = new char[n];

        // Initially fill the string with 'a'
        for (int i = 0; i < n; i++) {
            ans[i] = 'a';
        }

        int remaining = k - n;

        // Greedy: distribute extra value from right to left
        for (int i = n - 1; i >= 0; i--) {

            int value = Math.min(remaining, 25);

            ans[i] = (char) ('a' + value);

            remaining -= value;
        }

        return new String(ans);
    }
}