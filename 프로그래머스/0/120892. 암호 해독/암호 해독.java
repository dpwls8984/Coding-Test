class Solution {
    public String solution(String cipher, int code) {
        StringBuffer sb = new StringBuffer();
        
        for(int i=code;i<=cipher.length();i+=code){
            sb.append(cipher.charAt(i-1));
        }
        
        return sb.toString();
    }
}