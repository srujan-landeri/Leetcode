public class Missing {
    public static void main(String[] args){
        int arr[] = {1,2,3,9};
        System.out.println(missingNumber(arr, 5));
    }

    public static int missingNumber(int arr[],int k){
        int count = 0;
        int index = 0;
        int missing = 1;

        while(index < arr.length){
            if(arr[index] != missing){
                count++;
                if(count == k){
                    return missing;
                }
            }
            else{
                index++;
            }
            missing++;
        }

        return  k + missing - count - 1;
    }
}


