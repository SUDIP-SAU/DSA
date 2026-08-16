class Solution {
    public int lengthOfLastWord(String s) {

        int i = s.length() - 1;
        int count = 0;

        while (i >= 0) {

            if (s.charAt(i) == ' ') {

                if (count > 0) {
                    break;
                }

            } else {
                count++;
            }

            i--;
        }

        return count;
    }
}