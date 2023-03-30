import java.util.HashMap;

// Problem 1346

public class Check {
    public static void main(String [] args){
        int[] arr = {3,1,7,11};
        System.out.println(checkIfExsists(arr));
    }

    public static boolean checkIfExsists(int[] arr){
        
        HashMap<Integer,Integer> occured = new HashMap<>();

        for(int i = 0;i < arr.length; i++){
            if(occured.containsKey(2 * arr[i])){
                return true;
            }
            occured.put(arr[i], i);
        }

        return false;
    }
}
