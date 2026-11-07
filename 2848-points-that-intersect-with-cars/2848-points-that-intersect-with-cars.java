class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        HashSet<Integer>set=new HashSet<>();
        for(List<Integer>num:nums){
            
                int a=num.get(0);
                int b=num.get(1);

                while(a<=b){

                
                set.add(a);
                a=a+1;
                }

            
        }
        return set.size();
    }
}