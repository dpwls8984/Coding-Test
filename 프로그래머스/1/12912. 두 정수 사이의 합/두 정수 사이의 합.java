class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int c = 0;
        int d = 0;
        if(a > b){
            c = b;
            d = a;
        }else{
            c = a;
            d = b;
        }
        
        for(int i = c;i<=d;i++){
            answer += i;
        }
        return answer;
    }
}