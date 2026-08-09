class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashSet<Integer> hs = new HashSet<>();

        int left = 0;
        int right = 0;

        int n = nums.length;

        while(right < n) {

            if(hs.contains(nums[right])){
                return true;
            }
                
            hs.add(nums[right]);

            if( (right-left) >= k) {

                hs.remove(nums[left]);

                left++;
            }


            right++;
        }

        return false;
        
    }
}