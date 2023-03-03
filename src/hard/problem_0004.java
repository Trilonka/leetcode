package hard;

public class problem_0004 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum = nums1.length+nums2.length;
        int stop;
        if (sum%2==0) stop = sum/2-1;
        else stop = sum/2;
        int i = 0, j = 0;
        while (i+j < stop) {
            if (i==nums1.length) j++;
            else if (j==nums2.length) i++;
            else {
                if (nums1[i] < nums2[j]) i++;
                else j++;
            }
        }
        if (i==nums1.length) {
            if (sum%2==0) return 1.0*(nums2[j]+nums2[j+1])/2;
            else return nums2[j];
        } else if (j==nums2.length) {
            if (sum%2==0) return 1.0*(nums1[i]+nums1[i+1])/2;
            else return nums1[i];
        } else {
            if (sum%2==0) {
                int first, second;
                if (nums1[i] < nums2[j]) first=nums1[i++];
                else first=nums2[j++];
                if (i== nums1.length) second=nums2[j];
                else if (j== nums2.length) second=nums1[i];
                else second = Math.min(nums1[i], nums2[j]);
                return 1.0*(first+second)/2;
            } else {
                return Math.min(nums1[i], nums2[j]);
            }
        }
    }
}
