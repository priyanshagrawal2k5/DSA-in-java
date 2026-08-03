class Solution {
    public int noOfDigits(int x){
        int count = 0;
        while(x > 0){ 
            x = x/10;
            count++;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int k = 0; // no of even digits numbers
        for(int i=0; i<nums.length; i++){
            int totalcount = noOfDigits(nums[i]);
            if(totalcount % 2 == 0){
                k++;
            }
        }
        return k;
    }
}