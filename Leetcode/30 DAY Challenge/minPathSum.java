class minPathSum {
    public int minPathSum(int[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        int[][] arr = new int[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                arr[i][j] += grid[i][j];
                if(i >0 && j >0){
                    arr[i][j] += Math.min(arr[i-1][j], arr[i][j-1]);
                }
                else if(i > 0){
                    arr[i][j] += arr[i-1][j];
                }
                else if(j > 0){
                    arr[i][j] += arr[i][j-1];
                }
            }
        }
        return arr[arr.length-1][arr[0].length-1];
    }
}
