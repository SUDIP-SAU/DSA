class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;

        int total = 0;

        for (int num : cardPoints)
            total += num;

        if (k == n)
            return total;

        int window = n - k;

        int curr = 0;

        for (int i = 0; i < window; i++)
            curr += cardPoints[i];

        int minSum = curr;

        for (int i = window; i < n; i++) {

            curr += cardPoints[i];
            curr -= cardPoints[i - window];

            minSum = Math.min(minSum, curr);
        }

        return total - minSum;
    }
}