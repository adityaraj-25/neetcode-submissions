class Solution {
    public void rotate(int[] nums, int k) {
        for(int i=0;i<k;i++){
            rotateonce(nums);
        }
        System.out.println(nums);
    }
    public void rotateonce(int[] nums){
        int o=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            nums[i+1]=nums[i];
        }
        nums[0]=o;
    }
}