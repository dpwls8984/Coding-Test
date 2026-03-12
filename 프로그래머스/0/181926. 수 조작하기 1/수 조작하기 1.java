class Solution {
    public int solution(int n, String control) {
        for(int i=0;i<control.length();i++) {
            char s = control.charAt(i);
            if(s=='w') n += 1;
            if(s=='s') n -= 1;
            if(s=='d') n += 10;
            if(s=='a') n -= 10;
        }
        
        return n;
    }
}