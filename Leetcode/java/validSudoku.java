class validSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> ans = new HashSet();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char current = board[i][j];
                if(current != '.'){
                    if(!ans.add(current +"found in row"+ i) || !ans.add(current +"found in cloumn" + j) ||
                       !ans.add(current +"sub box"+ i/3 +"-"+ j/3))
                        return false;
                }
            }
        }
        return true;
    }
}
