import java.util.Arrays;

public class RunningSum1DArray {
    public static void main(String[] args){
        int num[] = {3,1,2,10,1};
        System.out.println((Arrays.toString(sum(num))));
    }

    public static int[] sum(int []num){
        for(int i = 1;i < num.length; i++){
            num[i] = num[i - 1] + num[i];
        }

        return num;
    }
}
