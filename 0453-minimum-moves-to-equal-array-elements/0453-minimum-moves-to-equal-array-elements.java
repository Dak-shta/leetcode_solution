class Solution {
    public int minMoves(int[] nums) {
        int maxi=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<maxi){
                maxi=nums[i];
            }
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            c=c+(nums[i]-maxi);
        }
        return c;
    }
}