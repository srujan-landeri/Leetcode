public class ceil{
    public static void main(String[] args){
        int arr[] = {2,3,5,9,14,16,18};
        System.out.println(ceiled(arr, 19));
    }

    public static int ceiled(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return arr[mid];
            }

            else if(arr[mid] < target){
                start = mid + 1;
            }

            else{
                end = mid - 1;
            }
        }

        if(start >= arr.length){
            return arr[start - 1];
        }

        return arr[start];
    }
}