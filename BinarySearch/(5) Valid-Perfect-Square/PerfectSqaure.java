public class PerfectSqaure {
    public static void main(String[] args){
       System.out.println(isPerfectSquare(4));
    }
    public static boolean isPerfectSquare(int num) {
        int start = 1; 
        int end = num; 
        
        while(start <= end){    
            int mid = start + (end - start) / 2;    
            float check = (float)num/(float)mid;

            if(mid == check){     
                return true;
            }

            else if(mid > check){ 
                end = mid - 1;  
            }

            else{
                start = mid + 1;
            }
        }

        return false;
    }
}


