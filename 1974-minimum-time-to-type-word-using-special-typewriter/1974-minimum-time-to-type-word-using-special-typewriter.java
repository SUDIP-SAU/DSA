class Solution {
    public int minTimeToType(String word) {
        
        int sum = 0;

        sum = Math.min(word.charAt(0) - 'a', 26 - (word.charAt(0) - 'a') );

        for (int i = 1; i < word.length(); i++) {

            int d1 = word.charAt(i) - 'a';
            int d2 = word.charAt(i-1) - 'a';

            //clockwise
            int dist = Math.abs(d2 - d1);

            //counter clockwise
            int dis = 26 - dist;

            sum += Math.min(dist,dis);
        }

        return sum + word.length();
    }
}