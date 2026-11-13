class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[]ans=new int[nums1.length];
        int idx=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    idx=j;
                    for(int c=idx;c<nums2.length;c++){
                        if(nums1[i]<nums2[c]){
                             ans[i]=nums2[c];
                             break;
                        }
                        else{
                            ans[i]=-1;
                        }
                    }
                   
                }
               
            }
        }
        return ans;
    }
}