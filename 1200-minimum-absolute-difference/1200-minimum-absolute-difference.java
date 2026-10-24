class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);

        int minDif = Integer.MAX_VALUE;

        // First loop: find minimum difference
        for (int i = 0; i < arr.length - 1; i++) {
            int currDif = arr[i + 1] - arr[i];

            if (currDif < minDif) {
                minDif = currDif;
            }
        }

        // Second loop: find all pairs with minimum difference
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            int currDif = arr[i + 1] - arr[i];

            if (currDif == minDif) {
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }

        return ans;
    }
}