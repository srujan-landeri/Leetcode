// guess(num) is an API available in leetcode
// public class gess {
//     public static void main(String args){

//     }
//     public static int guessNumber(int n){
//         int start = 1;
//         int end = n;

//         while(start <= end){
//             int mid = start + (end - start) / 2;
//             if(guess(mid) == 0){
//                 return mid;
//             }

//             else if(guess(mid) == -1){
//                 end = mid - 1;
//             }

//             else{
//                 start = mid + 1;
//             }
//         }

//         return -1;
//     }
// }