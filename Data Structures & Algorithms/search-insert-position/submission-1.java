class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length-1);
    }
    public int binarySearch(int[] nums, int target, int i, int j){
        int m=(i+j)/2;
        if(i<j){
            if(nums[m]==target) return m;
            else if(nums[m]<target){
                return binarySearch(nums,target,m+1,j);
            }else{
                return binarySearch(nums,target,i,m-1);
            }
        }else{
            if(nums[m]<target){
                m++;
            }
        }
        return m;
    }
}