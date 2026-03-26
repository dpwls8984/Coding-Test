import java.util.*;

class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        while(n>0){
            int a = (int)(n%10);
            list.add(a);
            n/=10;
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}