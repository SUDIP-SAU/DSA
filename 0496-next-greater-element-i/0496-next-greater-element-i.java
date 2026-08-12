class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            int value = nums1[i];

            int index = 0;

            while (nums2[index] != value) {
                index++;
            }

            ans[i] = -1;

            for (int j = index + 1; j < nums2.length; j++) {

                if (nums2[j] > value) {
                    ans[i] = nums2[j];
                    break;
                }
            }
        }

        return ans;
    }
}