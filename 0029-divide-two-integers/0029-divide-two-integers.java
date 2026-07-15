class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        int ans = 0;

        while (n >= d) {

            int cnt = 0;

            while (n >= (d << (cnt + 1))) {
                cnt++;
            }

            ans += (1 << cnt);
            n -= (d << cnt);
        }

        if ((dividend < 0) ^ (divisor < 0))
            return -ans;

        return ans;
    }
}