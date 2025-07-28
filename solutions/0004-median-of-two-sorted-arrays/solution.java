import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a[]=new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,a,0,nums1.length);
        System.arraycopy(nums2,0,a,nums1.length,nums2.length);
        Arrays.sort(a);
        int sum=0;
        if(a.length%2==1){
            return a[a.length/2];
        }
        return (a[a.length/2-1]+a[a.length/2])/2.0;
    }
}
