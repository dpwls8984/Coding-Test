class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String answer_st = "";
        answer_st = my_string.replaceAll("[a-zA-Z]", "");
        for(int i = 0;i<answer_st.length();i++){
            char a = answer_st.charAt(i);
            int answer_num = a - '0';
            answer += answer_num;
        }
        return answer;
    }
}