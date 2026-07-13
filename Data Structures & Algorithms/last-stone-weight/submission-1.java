class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<stones.length;i++) arr.add(stones[i]);
        while(arr.size()!=1){
            Collections.sort(arr);
            if((arr.get(arr.size()-1)==arr.get(arr.size()-2)) && arr.size()!=2){
                arr.remove(arr.size()-1);
                arr.remove(arr.size()-1);
            }else{
                int a=arr.get(arr.size()-1);
                int b=arr.get(arr.size()-2);
                arr.remove(arr.size()-1);
                arr.remove(arr.size()-1);
                arr.add(a-b);
            }
        }
        return arr.get(0);
    }
}
