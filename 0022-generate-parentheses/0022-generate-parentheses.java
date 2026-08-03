class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        solve("", 0, 0, n, ans);

        return ans;
    }

    private void solve(String current, int open, int close, int n, List<String> ans) {

        if (current.length() == 2 * n) {

            if (isValid(current))
                ans.add(current);

            return;
        }

        if (open < n)
            solve(current + "(", open + 1, close, n, ans);

        if (close < n)
            solve(current + ")", open, close + 1, n, ans);
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