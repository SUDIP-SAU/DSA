class Solution {
    public boolean checkDivisibility(int n) {
        
        int sum = 0;
        int prod = 1;

        int temp = n;

        while(temp != 0) {

           int mod = temp % 10;
           temp /= 10;

           sum += mod;
           prod *= mod;
            
        }

        if( n % (sum + prod) == 0) {

            return true;
        }

        else{

            return false;
        }
    }
}