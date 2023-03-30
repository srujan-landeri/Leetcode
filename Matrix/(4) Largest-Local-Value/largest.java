public class largest {
    public int[][] largestLocal(int[][] grid) {
        int maxLocal[][] = new int[grid.length - 2][grid.length - 2];

        for(int i = 0;i < grid.length - 2;i++){
            for(int j = 0; j < grid.length - 2;j++){
                maxLocal[i][j] = getLocal(grid,i,j);
            }
        }

        return maxLocal;
    }

    public static int getLocal(int[][]grid, int row_start, int col_start){
        int max = 0;

        for(int i = row_start;i <= row_start + 2; i++){
            for(int j = col_start;j <= col_start + 2;j++){
                max = Math.max(max,grid[i][j]);
            }
        }

        return max;
    }    
}
