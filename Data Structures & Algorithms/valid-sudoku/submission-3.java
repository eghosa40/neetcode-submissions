class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < 9; row++){
            Set<Character> set = new HashSet<>();

            for(int col = 0; col < 9; col++){
                if(board[row][col] == '.') continue;
                if(set.contains(board[row][col])) return false;
                set.add(board[row][col]);
            }
        }

        for(int col = 0; col < 9; col++){
            Set<Character> set = new HashSet<>();

            for(int row = 0; row < 9; row++){
                if(board[row][col] == '.') continue;
                if(set.contains(board[row][col])) return false;
                set.add(board[row][col]);
            }
        }

        for(int box = 0; box < 9; box++){
            Set<Character> set = new HashSet<>();

            for(int r = 0; r < 3; r++){
                for(int c = 0; c < 3; c++){
                    int row = (box / 3) * 3 + r;
                    int col = (box % 3) * 3 + c;

                    if(board[row][col] == '.') continue;
                    if(set.contains(board[row][col])) return false;
                    set.add(board[row][col]);
                }
            }
        }
        return true;
    }
}
