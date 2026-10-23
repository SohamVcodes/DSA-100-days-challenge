class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, Comparator.comparingInt(o -> o[1]));

        int maxUnits = 0;

        for (int i = boxTypes.length - 1; i >= 0; i--) {

            int boxesTaken = Math.min(truckSize, boxTypes[i][0]);

            maxUnits += boxesTaken * boxTypes[i][1];

            truckSize -= boxesTaken;

            if (truckSize == 0) {
                break;
            }
        }

        return maxUnits;
    }
}