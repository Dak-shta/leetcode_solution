class Solution {
    public int maxArea(int[] height) {
        // int left=0;
        // int width=0;
        // int ans=0;
        // int right=height.length-1;
        // while(left<right){
        //     width=right-left;
        //     int area=width*Math.min(height[left],height[right]);
        //     ans=Math.max(ans,area);
        //     if(height[left]<height[right]){
        //         left++;
        //     }
        //     else{
        //         right--;
        //     }
        // }
        // return ans;
        // int left=0;
        // int right=height.length-1;
        // int res=0;
        // int ans=0;
        // while(left<right){
        //     int width=right-left;
        //     res=width*Math.min(height[right],height[left]);
        //     ans=Math.max(ans,res);
        //     if(height[left]<height[right]){
        //         left++;
        //     }
        //     else{
        //         right--;
        //     }


        // }
            
        // return ans;
        // int left=0;
        // int right=height.length-1;
        // int width=0;
        // int ans=0;
        // while(left<right){
        //     width=right-left;
        //     ans=Math.max(ans,width*Math.min(height[left],height[right]));
        //     if(height[left]<height[right]){
        //         left++;
        //     }
        //     else{
        //         right--;
        //     }
        // }
        // return ans;
        int ans=0;
        int width=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            width=right-left;
            ans=Math.max(ans,width*Math.min(height[left],height[right]));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
        




















        
    }
}