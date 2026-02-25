class Solution {
    public int solution(int[] numbers) {
        int answer = -500000000;
        for(int i =0; i<numbers.length;i++){
            for(int j = i+1; j<numbers.length;j++){
                int max = numbers[i] * numbers[j];    
                if(max > answer){
                    answer = max;   
                }
            }
        }
        return answer;
    }
}