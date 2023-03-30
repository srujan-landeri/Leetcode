import java.util.*;
public class valid {
    public boolean isValidSudoku(char[][] board) {
        boolean validRow = isValidRow(board);
        boolean validCol = isValidCol(board);
        boolean validBox = isValidBox(board);

        return (validRow && validBox && validCol);
    }

     public static boolean isValidRow(char board[][]){
        
        ArrayList<Integer> vals = new ArrayList<Integer>();

        for(char row[]: board){

            // adding all the values
            for(char val: row){
                if(val != '.'){
                    vals.add(Character.getNumericValue(val));
                }
            }

            // System.out.println(vals);

            // checking duplicate values
            for(int i = 0; i < vals.size() - 1; i++){
                for(int j = i + 1; j < vals.size();j++){
                    if(vals.get(i) == vals.get(j)){
                        return false;
                    }
                }
            }
            
            // clearing already searched row
            vals.clear();
        }

        return true;
    }

    public static boolean isValidCol(char board[][]){

        ArrayList<Integer> vals = new ArrayList<Integer>();

        for(int i = 0;i < 9;i++){
            for(int j = 0;j < 9;j++){
                if(board[j][i] != '.'){
                    vals.add(Character.getNumericValue(board[j][i]));
                }
            }

        // System.out.println(vals);

        // checking duplicate values
        for(int k = 0; k < vals.size() - 1; k++){
            for(int m = k + 1; m < vals.size();m++){
                if(vals.get(k) == vals.get(m)){
                    return false;
                }
            }
        }
        
        // clearing already searched row
        vals.clear();

        }
        return true;
    }

    public static boolean isValidBox(char board[][]){
        int rowStart = 0;
        int colStart = 0;

        ArrayList<Integer> vals = new ArrayList<Integer>();


        for(int col = 1;col <=3; col++){
            for(int row = 1;row <= 3;row++){           
                for(int i = rowStart; i < rowStart+3; i++){           
                    for(int j = colStart;j< colStart+3;j++){
                        if(board[i][j] != '.'){
                            vals.add(Character.getNumericValue(board[i][j]));
                        }
                    }
                }

    
                for(int k = 0; k < vals.size() - 1; k++){
                    for(int m = k + 1; m < vals.size();m++){
                        if(vals.get(k) == vals.get(m)){
                            return false;
                        }
                    }
                }
    
                vals.clear();
                colStart+=3;
                
                
            }
            rowStart+=3;
            colStart=0;
        }
        
        return true;
    }
}