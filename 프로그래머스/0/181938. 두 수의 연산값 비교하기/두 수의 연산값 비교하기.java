class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aSt = a + "";
        String bSt = b + "";
        int c = Integer.valueOf(aSt + bSt);
        
        int multi = 2 * a * b;
        if(c > multi){
            answer = c;
        }else{
            answer = multi;
        }
        return answer;
    }
}