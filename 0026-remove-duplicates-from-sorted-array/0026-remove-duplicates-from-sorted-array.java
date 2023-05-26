class Solution {
    public int removeDuplicates(int[] nums) {
        // int index = 0;
        // for(int element : nums){
        //     if(index == 0 || element != nums[index - 1]){
        //         nums[index] = element;
        //         index++;
        //     }
        // }
        // return index;
        int index = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i + 1]){
                nums[index] = nums[i + 1];
                index++;
            }
        }
        return index;
    }
}