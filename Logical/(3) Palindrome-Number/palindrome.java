public class palindrome {
    public static boolean isPalindrome(int x){ // 121
        boolean isPalindrome = false;

        int givenNum = x;
        int reversed = 0;

        while(x > 0){
            int rem = x % 10;
            reversed = (reversed * 10) + rem;
            x = x / 10;
        }

        if(reversed == givenNum){
            return true;
        }

        return isPalindrome;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(1000000001));
    }
}
