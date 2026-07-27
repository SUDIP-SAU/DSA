class Solution {
    public int maxProduct(int[] nums) {
        
        int maxProd = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){

            for(int j = i+1; j < nums.length; j++){

                maxProd = Math.max(maxProd, (nums[i]-1)*(nums[j]-1));
            }
        }

        return maxProd;
    }
}