class Solution {
    public int splitArray(int[] nums, int k) {

        int low = 0;
        int high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int partitions = countPartitions(nums, mid);

            if (partitions <= k)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low;
    }

    private int countPartitions(int[] nums, int maxSum) {

        int partitions = 1;
        int sum = 0;

        for (int num : nums) {

            if (sum + num <= maxSum) {
                sum += num;
            } else {
                partitions++;
                sum = num;
            }
        }

        return partitions;
    }
}