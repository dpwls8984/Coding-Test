import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String a = Integer.toString(n);  
        
        for(int i =0;i<a.length();i++){
            char b = a.charAt(i);
            answer += (b - '0');
        }
        

        return answer;
    }
}