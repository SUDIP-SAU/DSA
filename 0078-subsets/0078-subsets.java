class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        solve(0, nums, new ArrayList<>(), ans);

        return ans;
    }

    private void solve(int index,
                       int[] nums,
                       List<Integer> list,
                       List<List<Integer>> ans) {

        ans.add(new ArrayList<>(list));

        for (int i = index; i < nums.length; i++) {

            list.add(nums[i]);

            solve(i + 1, nums, list, ans);

            list.remove(list.size() - 1);
        }
    }
}