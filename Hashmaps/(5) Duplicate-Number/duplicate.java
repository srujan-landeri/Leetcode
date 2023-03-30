import java.util.HashMap;

public class duplicate {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> occured = new HashMap<Integer,Integer>();

        for(int i:nums){
            if(occured.containsKey(i)){
                return i;
            }
            occured.put(i,0);
        }

        return -1;
    }
}
