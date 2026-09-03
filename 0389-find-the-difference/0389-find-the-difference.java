class Solution {
    public char findTheDifference(String s, String t) {

        boolean[] used = new boolean[t.length()];

        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < t.length(); j++) {

                if (!used[j] && s.charAt(i) == t.charAt(j)) {
                    used[j] = true;
                    break;
                }
            }
        }

        for (int j = 0; j < t.length(); j++) {
            if (!used[j]) {
                return t.charAt(j);
            }
        }

        return '\0';
    }
}