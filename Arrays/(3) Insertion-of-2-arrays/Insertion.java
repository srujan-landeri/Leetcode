
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Insertion {
    public static void main(String[] args){
        int nums1[] = {4,9,5};
        int nums2[] = {9,4,9,8,4};

        insertion(nums1, nums2);

        System.out.println(Arrays.toString(insertion(nums1, nums2)));
    }

    public static int[] insertion(int nums1[], int nums2[]){
        HashMap<Integer,Integer> occurences = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i :nums1){
            if(occurences.containsKey(i)){
                occurences.put(i,occurences.get(i) + 1);
            }
            else{
                occurences.put(i, 1);
            }
        }


        for(int i:nums2){
            if(occurences.containsKey(i) && (occurences.get(i) != 0)){
                result.add(i);
                occurences.put(i,occurences.get(i) - 1);
            }
        }


        int arr[] = new int[result.size()];

        for(int i = 0;i < result.size();i++){
            arr[i] = result.get(i);
        }
        
        return arr;
    }
}
