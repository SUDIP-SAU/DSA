class Solution {
    public int reverseDegree(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            int idx = ch - 'a';
            int fIdx = i + 1;
            int revIdx = 26 - idx;
            sum += (revIdx * fIdx);

        }
        
        return sum;
    }
}