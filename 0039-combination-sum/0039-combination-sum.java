class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();

        solve(0, candidates, target, new ArrayList<>(), ans);

        return ans;
    }

    private void solve(int index, int[] arr, int target,
                       List<Integer> list,
                       List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < arr.length; i++) {

            if (arr[i] > target)
                break;

            list.add(arr[i]);

            solve(i, arr, target - arr[i], list, ans);

            list.remove(list.size() - 1);
        }
    }
}