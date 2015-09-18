public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Character.getNumericValue(
        int row = board.length;
        int column = board[0].length;
        
        ArrayList<Integer> numberarray = new ArrayList<Integer>();
        for(int i = 0; i< 9 ; i++){
            numberarray.add(0);
        }
        for(int i = 0; i < row ; i++){
            for(int j = 0; j < column ; j++){
                if(board[i][j] == '.')
                    continue;
                int current_num = Character.getNumericValue(board[i][j]);
                if(numberarray.get(current_num - 1) > 0){  //get - index
                    return false;
                }else{
                    numberarray.set(current_num - 1, numberarray.get(current_num - 1) + 1);
                }
            }
            for(int k = 0; k< 9 ; k++){
                numberarray.set(k, 0);
            }
        }
        
        for(int j = 0; j < column ; j++){
            for(int i = 0; i < row ; i++){
                if(board[i][j] == '.')
                    continue;
                int current_num = Character.getNumericValue(board[i][j]);
                if(numberarray.get(current_num - 1) > 0){  //get - index
                    return false;
                }else{
                    numberarray.set(current_num - 1, numberarray.get(current_num - 1) + 1);
                }
            }
            for(int k = 0; k< 9 ; k++){
                numberarray.set(k, 0);
            }
        }
        
        for(int m = 0; m < 3 ; m++){
            for(int n = 0; n < 3 ; n++){
                for(int i = m*3; i < m*3+3 ; i++){
                    for(int j = n*3; j < n*3+3 ; j++){
                        if(board[i][j] == '.')
                            continue;
                        int current_num = Character.getNumericValue(board[i][j]);
                        if(numberarray.get(current_num - 1) > 0){  //get - index
                            return false;
                        }else{
                            numberarray.set(current_num - 1, numberarray.get(current_num - 1) + 1);
                        }
                    }
                    
                }
                for(int k = 0; k < 9 ; k++){
                    numberarray.set(k, 0);
                }
            }
        }
        return true;
    }
}
