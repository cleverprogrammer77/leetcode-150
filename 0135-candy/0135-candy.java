class Solution {
    public int candy(int[] ratings) {
        int totalCandies = 0;
        int[] arr = new int[ratings.length];
        int n = arr.length;
        Arrays.fill(arr, 1);
        for(int i = 0; i < n-1; i++){
            if(ratings[i+1] > ratings[i]){
                arr[i+1] = arr[i] + 1;
            }
        }
        for(int i = n-1; i >0; i--){
            if(ratings[i-1] > ratings[i]){
                if(arr[i-1] <= arr[i]){
                arr[i-1] = arr[i] + 1;
            }
            }
            
        }
        for(int i = 0 ; i < ratings.length; i++){
            totalCandies += arr[i];
        }
        return totalCandies;
    }
}