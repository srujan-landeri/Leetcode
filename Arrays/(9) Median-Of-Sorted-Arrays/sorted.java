class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int result[] = new int[nums1.length + nums2.length];

        int i = 0,j = 0,ind=0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                result[ind] = nums1[i];
                i++;
            }
            else{
                result[ind] = nums2[j];
                j++;
            }
            ind++;
        }

        while(i < nums1.length){
            result[ind] = nums1[i];
            i++;
            ind++;
        }

        while(j < nums2.length){
            result[ind] = nums2[j];
            j++;
            ind++;
        }
    
        if(result.length %2 != 0 ){
            return (double)result[result.length / 2];
        }
        else{
            return ((double)result[result.length/2] + (double)result[(result.length/2)-1])/2.0;
        }
    }
}