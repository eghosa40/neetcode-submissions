class Solution {
    public boolean isValidSudoku(char[][] board) {
        //check columns by turning it into a hashset 
        for(int row = 0; row < 9; row++){
            Set<Character> seen = new HashSet<>();
            for(int i = 0; i < 9; i++){
                if(board[row][i] == '.') continue;
                if(seen.contains(board[row][i])) return false;
                seen.add(board[row][i]);
            }
        }

        for(int col = 0; col < 9; col++){
            Set<Character> seen = new HashSet<>();
            for(int i = 0; i < 9; i++){
                if(board[i][col] == '.') continue;
                if(seen.contains(board[i][col])) return false;
                seen.add(board[i][col]);
            }
        }

        for(int square = 0; square < 9; square++){
            Set<Character> seen = new HashSet<>();
            for(int r = 0; r < 3; r++){
                for(int col = 0; col < 3; col++){
                    int column = (square % 3) * 3 + col;
                    int row = (square / 3) * 3 + r;
                    if(board[row][column] == '.') continue;
                    if(seen.contains(board[row][column])) return false;
                    seen.add(board[row][column]);
                }
            }
        }

        return true;

    }
}
