class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1 = -1, num2 = -1;
        int count1 = 0, count2 = 0;
        int len = nums.length;
        for(int el : nums){
            if(el == num1){
                num1 = el;
                count1++;
            }else if(el == num2){
                num2 = el;
                count2++;
            }else if(count1 == 0){
                num1 = el;
                count1 = 1;
            }else if(count2 == 0){
                num2 = el;
                count2 = 1;
            }else {
                count1--;
                count2--;
            }
        }
        List<Integer> res = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == num1){
                count1++;
            }else if(nums[i] == num2){
                count2++;
            }
        }
        if(count1 > len / 3){
            res.add(num1);
        }
        if(count2 > len / 3){
            res.add(num2);
        }
        return res;
    }
}