class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < 9; row++){
            Set<Character> rowSet = new HashSet<>();
            for(int column = 0; column < 9; column++){
                if(board[row][column] == '.') continue;
                if(rowSet.contains(board[row][column])) return false;
                rowSet.add(board[row][column]);
            }
        }

        for(int column = 0; column < 9; column++){
            Set<Character> colSet = new HashSet<>();
            for(int row = 0; row < 9; row++){
                if(board[row][column] == '.') continue;
                if(colSet.contains(board[row][column])) return false;
                colSet.add(board[row][column]);
            }
        }

        for(int box = 0; box < 9; box++){
            Set<Character> boxSet = new HashSet<>();

            for(int r = 0; r < 3; r++){
                for(int c = 0; c < 3; c++){
                    int row = (box / 3) * 3 + r;
                    int column = (box % 3) * 3 + c;

                    if(board[row][column] == '.') continue;
                    if(boxSet.contains(board[row][column])) return false;
                    boxSet.add(board[row][column]);
                }
            }
        }
        return true;
    }
}
