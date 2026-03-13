class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        for(int i=my_string.length();i>0;i--){
            String test = my_string.substring(my_string.length()-i);
            if(test.equals(is_suffix)){
                answer = 1;
                return answer;
            }    
        }
        return 0;
    }
}