class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
    public static void mergeSort(int[] nums, int low, int high){
        if(low<high){
            int mid=(low+high)/2;
            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    }
    public static void merge(int[] arr, int l, int m, int r){
        List<Integer> temp=new ArrayList<>();
        int i=l;
        int j=m+1;
        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }


        while (i <= m) {
            temp.add(arr[i]);
            i++;
        }

        while (j <= r) {
            temp.add(arr[j]);
            j++;
        }

        for (i = l; i <= r; i++) {
            arr[i] = temp.get(i - l);
        }
    }
}