import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class IndicesAfterSorting {
    public static void main(String[] args){
        int nums[] = {1,2,5,2,3};
        int target = 5;

        Arrays.sort(nums);

        System.out.println(findTarget(nums, target));
    }

    public static List<Integer> findTarget(int []nums, int target){
        List<Integer> indices = new ArrayList<Integer>();

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){

                
                while((mid != 0) && (nums[mid - 1] == nums[mid])){
                    mid--;
                }   
        
                while((mid != nums.length - 1) && (nums[mid + 1] == nums[mid])){
                    indices.add(mid);
                    mid++;
                }
                indices.add(mid);
                break;
            }

            else if(nums[mid] < target){
                start = mid + 1;
            }

            else{
                end = mid - 1;
            }
        }
        return indices;
    }


}
