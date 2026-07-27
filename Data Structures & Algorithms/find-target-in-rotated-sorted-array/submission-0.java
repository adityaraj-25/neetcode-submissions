class Solution {
    int count=0;
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) return count;
            count++;
        }
        return -1;
    }
}
 