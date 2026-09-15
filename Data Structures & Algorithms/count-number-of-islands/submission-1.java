class Solution {
    public int numIslands(char[][] grid) {
        int output = 0;
        
        for(int r = 0; r < grid.length; r++){
            for(int i = 0; i < grid[0].length; i++){
                if(grid[r][i] == '1'){
                    output++;
                    dfs(grid, r, i);
                }
            }
        }

        return output;
    }

    void dfs(char[][] grid, int r, int c){
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == '0'){
            return;
        }

        grid[r][c] = '0';

        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }
}
