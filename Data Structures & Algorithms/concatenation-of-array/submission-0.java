class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] nums1=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            nums1[i]=nums[i];
            nums1[i+nums.length]=nums[i];
        }
        return nums1;
    }
}