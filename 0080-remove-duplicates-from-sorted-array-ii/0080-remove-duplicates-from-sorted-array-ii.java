class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for(int val : nums){
            if(index == 0 || index == 1 || val != nums[index - 2]){
                nums[index] = val;
                index++;
            }
        }
        return index;
    }
}