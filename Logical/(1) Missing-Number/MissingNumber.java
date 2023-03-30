public class MissingNumber {
    public static void main(String[] args){
        int nums[] = {0,1,2};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums){
        // one way is to perform cyclic sort n^2

        // another way
        int n = nums.length;
        int desiredSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        System.out.println(desiredSum);

        for(int i = 0;i < nums.length;i++){
            actualSum += nums[i];
        }

        return (desiredSum - actualSum);
    }
}
