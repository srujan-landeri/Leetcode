import java.util.Arrays;

public class Search{
    public static void main(String[] args){
        int arr[][] = {
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24},
            {18,21,23,26,30}
        };

        System.out.println(Arrays.toString(index(arr, 20)));
    }

    public static int[] index(int matrix[][],int target){
        int row = 0;
        int col = matrix[0].length - 1;

        while(col > -1 && row < matrix.length){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }

            else if(matrix[row][col] > target){
                col--;
            }

            else{
                row++;
            }
        }
        return new int[]{-1,-1};

    }
}