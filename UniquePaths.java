class UniquePaths{
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] a : dp){
            Arrays.fill(a,-1);
        }
        return findPaths(0,0,m,n,dp);
    }

    public int findPaths(int row,int col,int m,int n,int[][] dp){
        if(row >= m || col>=n) return 0;

        if(row == m-1 && col == n-1) return 1;

        if(dp[row][col] != -1) return dp[row][col];

        return dp[row][col] = findPaths(row+1,col,m,n,dp) + findPaths(row,col+1,m,n,dp);
    }
}