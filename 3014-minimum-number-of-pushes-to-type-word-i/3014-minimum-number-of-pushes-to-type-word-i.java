class Solution {
    public int minimumPushes(String word) {

        int n = word.length();
        int pushes = 0;
        int cost = 1;

        while (n > 0) {

            int letters = Math.min(8, n);

            pushes += letters * cost;

            n -= letters;
            cost++;
        }

        return pushes;
    }
}