public class SearchInsertPosition {
    public static void main(String[] args){
        int nums[] = {1,3,5,6};
        int target = 2;

        System.out.println(findInsertPosition(nums, target));
    }

    public static int findInsertPosition(int nums[],int target){
        int start = 0;
        int end = nums.length - 1;
        int mid = -1;
        while(start <= end){
            mid = start + (end - start) / 2;

            // if exact answer is found
            if(nums[mid] == target){
                return mid;
            }

            else if(nums[mid] < target){
                start = mid + 1;
            }

            else{
                end = mid - 1;
            }
        }
        
        // after test case observations start shows correct position
        return start;

    }
}
