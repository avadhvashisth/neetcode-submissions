class Solution {
    public boolean isValidSudoku(char[][] board) {
        // check duplicates in each row
        for(int i = 0; i < 9; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(set.contains(board[i][j]))
                    return false;

                if(board[i][j] != '.')
                    set.add(board[i][j]);
            }
        }

        // check duplicates in each col
        for(int i = 0; i < 9; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(set.contains(board[j][i]))
                    return false;

                if(board[j][i] != '.')
                    set.add(board[j][i]);
            }
        }

        // check duplicates in each block
        for(int i = 0; i < 9; i+=3){
            for(int j = 0; j < 9; j+=3){
                HashSet<Character> set = new HashSet<>();
                for(int m = 0; m < 3; m++){
                    for(int n = 0; n < 3; n++){
                        if(set.contains(board[i + m][j + n]))
                            return false;

                        if(board[i + m][j + n] != '.')
                            set.add(board[i + m][j + n]);
                    }
                }
            }
        }

        return true;
    }
}
