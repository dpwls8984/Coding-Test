class Solution {
    public String solution(String cipher, int code) {
        StringBuffer stringBuffer = new StringBuffer();
        int a = 1;

        for(int i = 0;i<=cipher.length();i++){
            if(i == (code*a)){
                stringBuffer.append(cipher.charAt(i-1));
                a++;
            }
        }
        
        return stringBuffer.toString();
    }
}