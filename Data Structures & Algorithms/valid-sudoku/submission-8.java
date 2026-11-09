class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int col = 0; col < 9; col++){
            Set<Character> column = new HashSet<>();
            for(int row = 0; row < 9; row++){
                if(board[row][col] == '.') continue;
                if(column.contains(board[row][col])){
                    return false;
                }else{
                    column.add(board[row][col]);
                }

            }
        }

        for(int row = 0; row < 9; row++){
            Set<Character> r = new HashSet<>();
            for(int col = 0; col < 9; col++){
                if(board[row][col] == '.') continue;
                if(r.contains(board[row][col])){
                    return false;
                }else{
                    r.add(board[row][col]);
                }
            }
        }

        for(int b = 0; b < 9; b++){
            Set<Character> box = new HashSet<>();
            for(int row = 0; row < 3; row++){
                for(int col = 0; col < 3; col++){
                    int r = (b / 3) * 3 + row;
                    int c = (b % 3) * 3 + col;

                    if(board[r][c] == '.') continue;
                    if(box.contains(board[r][c])){
                        return false;
                    }else{
                        box.add(board[r][c]);
                    }
                }
            }
        }
        return true;
    }
}
