class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();

        int freq = 0;

        for(int i = 0; i < nums.length; i++){

            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
            
        }
        
        List<Integer> ls = new ArrayList<>();

        for(int k : hm.keySet()){

            if(hm.get(k) == 2){

                ls.add(k);
            }
        }

        return ls;

    }
}