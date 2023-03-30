package logn_approach;

public class arrange_logn {
    public static void main(String[] args){
        System.out.println(totalStairs(21));
    }

    public static int totalStairs(int n){
        long start = 1;
        long end = n;

        while(start <= end){
            long mid = start + (end - start) / 2;

            // sum coould be long for 2 ^ 31 input
            long sum = (mid * (mid + 1))/2;

            if(sum == n){
                return (int)mid;
            }

            else if(sum < n){
                start = mid + 1;
            }

            else{
                end = mid - 1;
            }
        }
        return (int)end;
    }

}
