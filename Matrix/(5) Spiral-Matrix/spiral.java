import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int down = matrix.length - 1;

        int totalLetters = matrix[0].length * matrix.length;
        int lettersChecked = 0;
        List<Integer> finalOrder = new ArrayList<Integer>();

        while(lettersChecked != totalLetters){
            // printing row
            for(int i = left;i <= right;i++){
                finalOrder.add(matrix[top][i]);
                lettersChecked++;
            }
            if(lettersChecked == totalLetters) break;
            top++;

            for(int i = top; i <= down; i++){
                finalOrder.add(matrix[i][right]);
                lettersChecked++;
            }
            if(lettersChecked == totalLetters) break;
            right--;

            for(int i = right; i >= left; i--){
                finalOrder.add(matrix[down][i]);
                lettersChecked++;
            }
            if(lettersChecked == totalLetters) break;
            down--;

            for(int i = down; i >= top; i--){
                finalOrder.add(matrix[i][left]);
                lettersChecked++;
            }
            if(lettersChecked == totalLetters) break;
            left++;

        }

        return finalOrder;
    }
}