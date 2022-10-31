// ! Problem-Statement: https://leetcode.com/problems/set-matrix-zeroes/
class Solution {
    public void setZeroes(int[][] matrix) {
        int rows= matrix.length;
        int col=matrix[0].length;
        int col0=1;
        for(int i=0; i< rows; i++){
            if (matrix[i][0]==0) col0=0;
            for(int j=1; j<col; j++){// j=1 Because we already checked for column zero
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        // To avoid confusion of zeroes in row[0] and col[0] with 
        // flipped values of zeroes we start traversal from the end.
        
        // Since we have used another flag col0 to determine whether it has zero in it or 
        // not so we only traverse till col[n]->col[1], now if col0=0 that means col[0] has
        // a value zero in the column itself so we can change the matrix[i][0]=0
        for(int i=rows-1; i>=0; i--){
            for(int j=col-1; j>=1; j--)                
            {
                if(matrix[0][j]==0 || matrix[i][0]==0)
                    matrix[i][j]=0;
            }
            if(col0==0)
                matrix[i][0]=0;
            
        }    
    }
}