class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int left = 0, right = 0;
        int[] sorted = new int[m+n];
        int idx = 0;
        while(left < m && right < n) {
            if(nums1[left] <= nums2[right]) {
                sorted[idx++] = nums1[left++];
            } else {
                sorted[idx++] = nums2[right++];
            }
        }
        
        while(left < m) {
            sorted[idx++] = nums1[left++]; 
        }
        
        while(right < n) {
            sorted[idx++] = nums2[right++];
        }
        
        for(int i=0; i<m+n; i++)
            System.out.println(sorted[i]);
        
        if(sorted.length <= 1) return sorted[0];
        if(sorted.length % 2 == 0) {
            int half = sorted.length/2;
            return (sorted[half-1] + sorted[half]) / 2.0;
        } else {
            return sorted[sorted.length/2];
        }
    }
}