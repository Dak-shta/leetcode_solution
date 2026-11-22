class Solution {
    public boolean checkString(String s) {
        boolean f=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                f=true;
            }
            if(f==true && s.charAt(i)=='a'){
                return false;
            }
        }
        return true;
    }
}