class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            if(bsearch(matrix[i],target,0,matrix[i].length-1)) return true;
        }
        return false;
    }
    public boolean bsearch(int arr[], int target, int l, int r){
        if (l > r)
            return false;

        int m = l + (r - l) / 2;

        if (arr[m] == target)
            return true;
        else if (arr[m] > target)
            return bsearch(arr, target, l, m - 1);
        else
            return bsearch(arr, target, m + 1, r);
    }
}
