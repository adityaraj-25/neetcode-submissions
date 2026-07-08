class Solution {
    public int majorityElement(int[] nums) {
        for(int num:nums){
            int count=0;
            for(int i:nums){
                if(i==num){
                    count++;
                }
            }
            if(count>nums.length/2){
                return num;
            }
        }
        return -1;
    }
}