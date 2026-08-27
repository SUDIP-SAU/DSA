class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();

        generate(0, nums, new ArrayList<>(), set);

        return new ArrayList<>(set);
    }

    private void generate(int index, int[] nums,
                          List<Integer> current,
                          Set<List<Integer>> set) {

        if (index == nums.length) {
            set.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        generate(index + 1, nums, current, set);

        current.remove(current.size() - 1);
        generate(index + 1, nums, current, set);
    }
}