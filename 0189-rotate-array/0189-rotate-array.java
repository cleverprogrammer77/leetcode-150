class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k , nums.length - 1);
        reverse(nums, 0, nums.length - 1);
        
    }
    private void reverse(int[] arr, int i, int j){
        int li = i;
        int ri = j;
        while(li < ri){
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
        }
    }
}