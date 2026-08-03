class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        generate("", 2 * n, ans);

        return ans;
    }

    private void generate(String s, int len, List<String> ans) {

        if (s.length() == len) {

            if (isValid(s))
                ans.add(s);

            return;
        }

        generate(s + "(", len, ans);
        generate(s + ")", len, ans);
    }

    private boolean isValid(String s) {

        int count = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(')
                count++;
            else
                count--;

            if (count < 0)
                return false;
        }

        return count == 0;
    }
}