class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        HashSet<Integer>set=new HashSet<>();
        for(List<Integer>num:nums){
            for(int i=0;i<num.size();i++){
                int a=num.get(0);

                while(a<=num.get(1)){

                
                set.add(a);
                a=a+1;
                }

            }
        }
        return set.size();
    }
}