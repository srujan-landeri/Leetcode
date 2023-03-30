import java.util.Arrays;

public class Search{
    public static void main(String[] args){
        int arr[][] = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };

        System.out.println(Arrays.toString(index(arr, 60)));
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