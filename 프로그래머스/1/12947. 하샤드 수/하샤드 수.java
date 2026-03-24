class Solution {
    public boolean solution(int x) {        
        String y = Integer.toString(x);
        int a = 0;
        
        for(int i=0;i<y.length();i++){
            a += y.charAt(i) - '0';
        }
        
        if(x % a == 0){
            return true;
        }else{
            return false;
        }
    }
}