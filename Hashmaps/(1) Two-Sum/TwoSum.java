import java.util.Arrays;
import java.util.HashMap;

public class TwoSum{
    public static void main(String[] args){
        int nums[] = {3,3};
        
        System.out.println(Arrays.toString(twoSum(nums,6)));
    }

    public static int[] twoSum(int nums[], int target){

        HashMap<Integer,Integer> vals = new HashMap<Integer,Integer>();

        for(int i = 0;i < nums.length; i++){
            if(vals.containsKey(target - nums[i])){
                return new int[]{vals.get(target - nums[i]),i};
            }
            vals.put(nums[i], i);
        }

        return new int[] {-1,-1};
    }

    // Using Hashmap is an optimal solution as it has very less time complecity
    // The result can be known in single loop that is, O(n)

    // .put(inserting a new key value pair)
    // .get(retirving value of existing key)
    // .containsKey(Checking exsistance of a key)

}