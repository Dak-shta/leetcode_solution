class Solution {
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int lcm(int a, int b) {
            return (a / gcd(a, b)) * b;
                                                                                    }
    
    public int maxLength(int[] nums) {
       int ans=Integer.MIN_VALUE;
       
       for(int i=0;i<nums.length;i++){
        int prod=1;
        int g=0;
        int l=1;
        for(int j=i;j<nums.length;j++){
            prod=prod*nums[j];
            g=gcd(g,nums[j]);
            l=lcm(l,nums[j]);
            if(prod==g*l){
                ans=Math.max(ans,j-i+1);
            }
        }
       }
       
       return ans;
    }
}