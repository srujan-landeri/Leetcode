class Merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int t = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while(i > -1 && j > -1){
            if(nums1[i] < nums2[j]){
                nums1[t--] = nums2[j--];
            }
            else{
                nums1[t--] = nums1[i--];
            }
        }
        for(int k: nums1){
            System.out.print(k);
        }
        
        System.out.println();
        while(j > -1){
            nums1[t] = nums2[j--];
        }

        for(int k: nums1){
            System.out.print(k);
        }
    }

    public static void main(String[] args){
        merge(new int[] {4,5,6,0,0,0}, 3, new int[] {1,2,3}, 3);
    }
}