class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;  // Height
        int n = board[0].length; // Width
        int[][] next = new int[m][n]; // Next State
        int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}};
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<n; j++)
            {
                int alive = 0;
                for (int[] direction : directions)
                {
                    int a = direction[0] + i;
                    int b = direction[1] + j;
                    if (a>=0 && a<m && b>=0 && b<n && board[a][b] == 1)
                    {
                        alive++;
                    }
                }
                if (board[i][j]==0 && alive==3)
                {
                    next[i][j]=1;
                } else if (board[i][j]==1)
                    {
                        if (alive==2 || alive==3)
                        {
                            next[i][j] = 1;
                        }
                    }
                }    
            }
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<n; j++)
            {
                board[i][j] = next[i][j];
            }
        }
    }
}
