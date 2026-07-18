class Solution {
    public int beautySum(String s) {

        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                int[] freq = new int[26];

                // Count frequencies for substring s[i...j]
                for (int k = i; k <= j; k++) {
                    freq[s.charAt(k) - 'a']++;
                }

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        maxFreq = Math.max(maxFreq, freq[k]);
                        minFreq = Math.min(minFreq, freq[k]);
                    }
                }

                ans += (maxFreq - minFreq);
            }
        }

        return ans;
    }
}