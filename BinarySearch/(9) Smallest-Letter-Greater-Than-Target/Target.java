public class Target{
    public static void main(String[] args){
        char[] letters = {'c','f','j'};
        System.out.println(nextGreatesLetter(letters, 'j'));
    }

    public static char nextGreatesLetter(char[] letters,char target){
        int start = 0;
        int end = letters.length - 1;


        while(start <= end){
            int mid = start + (end - start) / 2;

            if(letters[mid] > target){
                end = mid - 1;
            }

            else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}