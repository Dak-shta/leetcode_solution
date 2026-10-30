class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int[]ans=new int[2];
        // for(int i=0;i<numbers.length;i++){
        //     for(int j=i+1;j<numbers.length;j++){
        //         if(numbers[i]+numbers[j]==target){
        //             ans[0]=i+1;
        //             ans[1]=j+1;
                    
        //         }
        //     }
        // }
        // return ans;
        // int left=0;
        // int right=numbers.length-1;
        // while(left<right){
        //     if(numbers[left]+numbers[right]<target){
        //         left++;
        //     }
        //     else if(numbers[left]+numbers[right]>target){
        //         right--;
        //     }
        //     else{
        //         ans[0]=left+1;
        //         ans[1]=right+1;
        //         break;
        //     }
        // }
        // return ans;
        // int ans[]=new int[2];
        // int k=0;
        // int left=0;
        // int right=numbers.length-1;
        // while(left<right){
        //     int sum=numbers[left]+numbers[right];
        //     if(sum==target){
        //         ans[k++]=left+1;
        //         ans[k++]=right+1;
        //         break;
        //     }
        //     else if(sum<target){
        //         left++;
        //     }
        //     else{
        //         right--;
        //     }
        // }
        // return ans;

        int left=0;
        int right=numbers.length-1;
        int[]ans=new int[2];
        while(left<right){
            if(numbers[left]+numbers[right]==target){
                ans[0]=left+1;
                ans[1]=right+1;
               return ans;
            }
            else if(numbers[left]+numbers[right]<target){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;




















    }
}