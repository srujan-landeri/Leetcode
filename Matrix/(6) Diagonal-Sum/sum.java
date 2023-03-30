class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;

        int left = 0;
        int right = mat.length - 1;
        int row = 0;

        while(left <= mat.length - 1 && right >= 0){
            if(row == (mat.length/2)){
                if(mat.length % 2 == 0){
                    sum += (mat[row][left] + mat[row][right]);
                }
                else{
                    sum += (mat[row][left]);
                }
            }
            else{
                sum += (mat[row][left] + mat[row][right]);
            }
            left++;right--;row++;
        }

        return sum;
    }
}

public class sum {
    
}
