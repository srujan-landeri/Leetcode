public class sqrt {
    public static void main(String[] args){
        System.out.println(mySqrt(1));
    }   

    public static int mySqrt(int x){
        int start = 1;
        int end = x;
        
        while(start <= end){
            int mid = start + (end - start) / 2;

            // you might be wondering why wont I use mid * mid 
            // reason: the constraints are ranging from 0 to
            // 2 ^ 31 

            // if we use mid * mid there might be an overflow and 
            // hence raising an error 
            // more efficient way would be the below approach
            
            if(mid == x/mid){
                return mid;
            }

            else if(mid > x/mid){
                end = mid - 1;
            }

            else{
                start = mid + 1;
            }
        }

        return end;
    }
}
