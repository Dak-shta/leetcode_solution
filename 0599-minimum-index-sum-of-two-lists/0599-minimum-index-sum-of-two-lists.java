class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        int mini=Integer.MAX_VALUE;
        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                int sum=map.get(list2[i])+i;
                if(sum<mini){
                    mini=sum;
                    ans.clear();
                    ans.add(list2[i]);
                }
                else if(sum==mini){
                    ans.add(list2[i]);
                }
            }
        }
        return ans.toArray(new String[0]);
    }
}