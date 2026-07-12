class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int k=0;
        int[] temp=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                k++;
                set.add(nums[i]);
                temp[k-1]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
        return k;
    }
}