class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);

        int n = nums.length;
        int prev = 0;
        int next = prev+1;

        while(next < n) {

            if (nums[next] == nums[prev])
                return true;

            else {
                prev++;
                next++;
            }
        }

        return false;
    }
}