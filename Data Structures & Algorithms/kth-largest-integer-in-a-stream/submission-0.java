class KthLargest {
    private int arr[];
    private int idx;
    public KthLargest(int k, int[] nums) {
        arr=new int[nums.length];
        for(int i=0;i<nums.length;i++) arr[i]=nums[i];
        idx=k;
    }
    
    public int add(int val) {
        int[] narr=new int[arr.length+1];
        for(int i=0;i<arr.length;i++) narr[i]=arr[i];
        narr[arr.length]=val;
        arr=new int[narr.length];
        for(int i=0;i<arr.length;i++) arr[i]=narr[i];
        Arrays.sort(arr);
        return arr[arr.length-idx];
    }
}
