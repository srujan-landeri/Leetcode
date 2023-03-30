public class remove {
    public int removeDuplicates(int[] nums) {
        int left, right;
        left = right = 1;

        while(right != nums.length){
            while(nums[right] == nums[right - 1]){
                right++;
                if(right == nums.length){
                    return left;
                }
            }

            nums[left] = nums[right];
            right++;left++;
        }

        return left;
    }
}
