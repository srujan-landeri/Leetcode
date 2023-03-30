import java.util.HashMap;

public class NumberOfGoodPairs {
    public static void main(String[] args){

        int nums[] = {1,2,3,1,1,3};
        System.out.println(numGoodPairs(nums));
        
    }

    public static int numGoodPairs(int[] nums){
        int goodPairs = 0;

        HashMap<Integer,Integer> pairs = new HashMap<Integer,Integer>();

        for(int i = 0;i < nums.length;i++){
            if(pairs.containsKey(nums[i])/* && (pairs.get(num[i]) < i)*/){
                goodPairs+=pairs.get(nums[i]);
                pairs.put(nums[i], pairs.get(nums[i]) + 1);
            }
            else{
                pairs.put(nums[i], 1);
            }
        }

        return goodPairs;
    }
}
