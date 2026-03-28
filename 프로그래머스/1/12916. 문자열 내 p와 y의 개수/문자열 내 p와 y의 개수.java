class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String a = s.replaceAll("[^pP]", "");
        String b = s.replaceAll("[^yY]", "");
        
        
        
        if(a.length() == b.length()){
            answer = true;
        }else if(a.length() != b.length()){
            answer =  false;
        }else{
            answer = true;
        }
        
        return answer;
    }
}