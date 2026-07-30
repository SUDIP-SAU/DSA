class Solution {
    public int minimumPushes(String word) {

        int pushes = 0;
        int press = 1;

        for (int i = 0; i < word.length(); i++) {

            if (i > 0 && i % 8 == 0)
                press++;

            pushes += press;
        }

        return pushes;
    }
}