class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i] - 1)){
                continue;
            }else {
                int count = 0;
                int curr = nums[i];
                while(set.contains(curr)){
                    count++;
                    curr++;
                }
                 ans = Math.max(count, ans);
            }
        }
        return ans;
    }
}