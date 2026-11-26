class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>> ans=new ArrayList<>();
        // Arrays.sort(nums);
        // int n=nums.length;

        // for(int i=0;i<n;i++){
        //     if(i>0 && nums[i]==nums[i-1]){
        //         continue;
        //     }

        //     int j=i+1;
        //     int k=n-1;
        //     while(j<k){
        //         int sum=nums[i]+nums[j]+nums[k];

        //         if(sum==0){
        //              List<Integer> l=new ArrayList<>();
        //             l.add(nums[i]);
        //             l.add(nums[j]);
        //             l.add(nums[k]);
        //             ans.add(l);
        //             j++;
        //             k--;
        //             while(j<k && nums[j]==nums[j-1]){
        //             j++;
        //         }
        //         while(j<k && nums[k]==nums[k+1]){
        //             k--;
        //         }
        //         }
        //         else if(sum<0){
        //             j++;
        //         }
        //         else{
        //             k--;
        //         }

        //     }
        // }

        // return ans;
        // List<List<Integer>>ans=new ArrayList<>();
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-2;i++){
        //     if(i>0 && nums[i]==nums[i-1]){
        //         continue;
        //     }
        //     int left=i+1;
        //     int right=nums.length-1;

        //     while(left<right){
        //         int sum=nums[i]+nums[left]+nums[right];
        //         if(sum==0){
        //              List<Integer>l=new ArrayList<>(); 
        //             l.add(nums[i]);
        //             l.add(nums[left]);
        //             l.add(nums[right]);
        //             ans.add(l);

        //         while(left<right && nums[left]==nums[left+1]){
        //             left++;
        //         }
        //         while(left<right && nums[right]==nums[right-1]){
        //             right--;
        //         }
        //         left++;
        //         right--;
        //         }

        //     else if(sum<0){
        //         left++;
        //     }
        //     else{
        //         right--;
        //     }
        //     }

        // }

        // return ans;
        // List<List<Integer>>ans=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(i>0 && nums[i]==nums[i-1]){
        //         continue;
        //     }
        //     int left=0;
        //     int right=nums.length-1;
        //     while(left<right){
        //         intsum=nums[i]+nums[left]+nums[right];
        //         List<Integer>a=new ArrayList<>();
        //          if(sum==0){
        //                                 a.add(nums[i]);
        //                                                     a.add(nums[left]);
        //                                                                         a.add(nums[right]);
        //                                                                                             ans.add(a);

        //         while(left<right&&nums[left]==nums[left+1]){
        //             left++;
        //         }
        //         while(left<right && nums[right]==nums[right-1]){
        //             right--;
        //         }

        //     }
        // }
        // int n = nums.length;
        // List<List<Integer>> ans = new ArrayList<>();
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length - 2; i++) {
        //     if (i > 0 && nums[i] == nums[i - 1]) {
        //         continue;
        //     }
        //     int left = i + 1;
        //     int right = n - 1;
        //     while (left < right) {
        //         int sum = nums[i] + nums[left] + nums[right];
        //         if (sum == 0) {
        //             List<Integer> l = new ArrayList<>();
        //             l.add(nums[i]);
        //             l.add(nums[left]);
        //             l.add(nums[right]);
        //             ans.add(l);
        //             left++;
        //             right--;

        //             while (left < right && nums[left] == nums[left - 1]) {
        //                 left++;
        //             }
        //             while (left < right && nums[right] == nums[right + 1]) {
        //                 right--;
        //             }
        //         } else if (sum < 0) {
        //             left++;
        //         } else {
        //             right--;
        //         }
        //     }
        // }
        // return ans;
        int n=nums.length;
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    List<Integer>l=new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[left]);
                    l.add(nums[right]);
                    ans.add(l);
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]){

                        left++;
                    }
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return ans;

    }
}