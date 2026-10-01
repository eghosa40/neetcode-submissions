class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int r = 0; r < 9; r++){
            HashSet<Character> row = new HashSet<>();
            for(int i = 0; i < 9; i++){
                char a = board[r][i];
                if(a == '.') continue;
                if(!row.add(a)) return false;
            }
        }

        for(int c = 0; c < 9; c++){
            HashSet<Character> col = new HashSet<>();
            for(int i = 0; i < 9; i++){
                char a = board[i][c];
                if(a == '.') continue;
                if(!col.add(a)) return false;
            }
        }

        for(int b = 0; b < 9; b++){
            HashSet<Character> box = new HashSet<>();
            for(int r = 0; r < 3; r++){
                for(int c = 0; c < 3; c++){
                    int row = (b/3)*3 + r;
                    int col = (b % 3) * 3 + c;

                    char a = board[row][col];
                    if(a == '.') continue;
                    if(!box.add(a)) return false;
                }
            }
        }
        return true;
    }
}
