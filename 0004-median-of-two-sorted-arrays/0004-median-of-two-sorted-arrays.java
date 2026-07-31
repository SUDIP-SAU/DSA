class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int total = n + m;

        int ind1 = (total - 1) / 2;
        int ind2 = total / 2;

        int i = 0, j = 0;
        int cnt = 0;

        int ele1 = -1;
        int ele2 = -1;

        while (i < n && j < m) {

            int val;

            if (nums1[i] < nums2[j])
                val = nums1[i++];
            else
                val = nums2[j++];

            if (cnt == ind1)
                ele1 = val;

            if (cnt == ind2)
                ele2 = val;

            cnt++;
        }

        while (i < n) {

            if (cnt == ind1)
                ele1 = nums1[i];

            if (cnt == ind2)
                ele2 = nums1[i];

            cnt++;
            i++;
        }

        while (j < m) {

            if (cnt == ind1)
                ele1 = nums2[j];

            if (cnt == ind2)
                ele2 = nums2[j];

            cnt++;
            j++;
        }

        if (total % 2 == 1)
            return ele2;

        return (ele1 + ele2) / 2.0;
    }
}