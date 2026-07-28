class Solution {
    public String smallestPalindrome(String s) {

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        StringBuilder left = new StringBuilder();
        String middle = "";

        int i = 0;

        while (i < arr.length) {

            int j = i;

            while (j < arr.length && arr[j] == arr[i])
                j++;

            int count = j - i;

            for (int k = 0; k < count / 2; k++)
                left.append(arr[i]);

            if (count % 2 == 1)
                middle = String.valueOf(arr[i]);

            i = j;
        }

        String right = left.reverse().toString();

        left.reverse();

        return left.toString() + middle + right;
    }
}