public class CountNeg{
    public static void main(String[] args){
        int grid[][] = {
            {4,3,2,-1},
            {3,2,1,-1},
            {1,1,-1,-2},
            {0,-1,-2,-3}
        };

        System.out.println(count(grid));
    }

    public static int count(int[][] grid){
        int total = 0;
        int row = 0;
        int col = grid[row].length - 1;

        
        while(true){

            if(grid[row][col] < 0){
                total++;

                if(col != 0){
                    col--;
                }

                else{
                    row++;
                    if(row == grid.length){
                        break;
                    }
                    col = grid[row].length - 1;
                }
                  
            }

            else{
                if(row != grid.length - 1){
                    row++;
                    col = grid[row].length - 1;
                }
                else{
                    break;
                }
            }
        }
        return total;
    }
}