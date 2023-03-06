package easy;

/**
 Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

 Return the kth positive integer that is missing from this array.
 */
public class problem_1539 {

    public int findKthPositive(int[] arr, int k) {
        int ost = k;
        int num = 0;
        for (int j : arr) {
            ost -= (j - num - 1);
            if (ost <= 0) return ost + j - 1;
            num = j;
        }
        return num + ost;
    }

    public int findKthPositiveNotMy(int[] arr, int k) {
        for (int i : arr) {
            if (i <= k) k++;
            else break;
        }
        return k;
    }


}
