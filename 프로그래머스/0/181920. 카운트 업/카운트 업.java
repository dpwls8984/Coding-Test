class Solution {
    public int[] solution(int start_num, int end_num) {
        int n = end_num-start_num +1;
        int[] answer = new int[n];
        //숫자를 리스트에 담는다 -> 어떻게?
//      return Arrays.stream(numbers).map(i -> i * 2).toArray();
        
        for(int i=0;i<n;i++) {
            answer[i] = start_num;
            start_num++;
        }
        return answer;
    }
}