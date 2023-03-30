import java.util.Arrays;

public class occurence{
    public static void main(String[] args){
        int arr[] = {2,7,7,7,8,8,8,8,8,8,10};
        int firstInd = firstOccurence(arr, 8, 0, arr.length - 1);

        if(firstInd == -1){
            System.out.println();
        }
        int lastInd = lastOccurence(arr, 8, firstInd + 1, arr.length - 1);

        System.out.println(Arrays.toString(new int[] {firstInd,lastInd}));
    }

    public static int firstOccurence(int arr[],int target,int start,int end){
        int pontentialAns = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                pontentialAns = mid;
                end = mid - 1;
            }

            else if(arr[mid] < target){
                start = mid + 1;
            }

            else{
                end = mid - 1;
            }

        }
        
        return pontentialAns;
    }
    public static int lastOccurence(int arr[],int target,int start,int end){
        int pontentialAns = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                pontentialAns = mid;
                start = mid + 1;
            }

            else if(arr[mid] < target){
                start = mid + 1;
            }

            else{
                end = mid - 1;
            }

        }
        
        return pontentialAns;
    }
}