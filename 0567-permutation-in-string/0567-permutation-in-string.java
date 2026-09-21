class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count = new int[26];

        for (char ch : s1.toCharArray()) {
            count[ch - 'a']++;
        }

        int left = 0;
        int right = 0;
        int windowSize = s1.length();

        while (right < s2.length()) {

            count[s2.charAt(right) - 'a']--;
            right++;

            if (right - left > windowSize) {
                count[s2.charAt(left) - 'a']++;
                left++;
            }

            if (right - left == windowSize) {

                boolean valid = true;

                for (int i = 0; i < 26; i++) {
                    if (count[i] != 0) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    return true;
                }
            }
        }

        return false;
    }
}