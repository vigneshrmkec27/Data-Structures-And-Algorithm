class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    private Boolean solve(char[][] board)
    {
        for(int r=0;r<board.length;r++)
        {
            for(int c=0;c<board[0].length;c++ )
            {
                if(board[r][c]=='.')
                {
                    for(char n='1';n<='9';n++)
                    {
                        if(issolve(board,r,c,n)){
                        board[r][c]=n;
                        if (solve(board))
                                return true;
                            else
                                board[r][c] = '.';
                        
                        }

                    }return false;
                }
                
            }
        }
        return true;
    }

    private Boolean issolve(char[][] board,int r,int c,char n)
    {
        for (int i = 0; i < 9; i++) {
            // Check row
            if (board[r][i] == n) return false;

            // Check column
            if (board[i][c] == n) return false;

            // Check 3x3 box
            int boxRow = 3 * (r / 3) + i / 3;
            int boxCol = 3 * (c/ 3) + i % 3;
            if (board[boxRow][boxCol] == n) return false;
        }
        return true;
    }
}