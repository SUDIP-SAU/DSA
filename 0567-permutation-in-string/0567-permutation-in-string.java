class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        char[] target = s1.toCharArray();
        Arrays.sort(target);

        String sortedS1 = new String(target);

        int k = s1.length();

        for (int i = 0; i <= s2.length() - k; i++) {

            String window = s2.substring(i, i + k);

            char[] chars = window.toCharArray();
            Arrays.sort(chars);

            if (new String(chars).equals(sortedS1)) {
                return true;
            }
        }

        return false;
    }
}