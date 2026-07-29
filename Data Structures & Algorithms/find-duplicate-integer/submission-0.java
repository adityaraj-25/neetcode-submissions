class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int e:map.keySet()){
            if(map.get(e)>1) return e;
        }
        return -1;
    }
}
