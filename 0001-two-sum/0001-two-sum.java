class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int want = target - nums[i];
            if(map.containsKey(want)){
                return new int[] {map.get(want), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}