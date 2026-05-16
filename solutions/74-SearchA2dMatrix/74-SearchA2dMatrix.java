// Last updated: 5/16/2026, 10:17:49 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(target==matrix[i][j]) return true;
                if(target<matrix[i][j]) return false;
            }
        }
        return false;
    }
}