import java.util.*;

class Solution {
    public int solution(int[] nums) {                
        Set<Integer> set = new HashSet<>();
        for(int n: nums) set.add(n);
        
        int maxCanTake = nums.length / 2; // 가질 수 있는 최대 마리 수
        int types = set.size();           // 폰켓몬 종류 수
    
        // 둘 중에 더 작은 값이 정답
        return Math.min(maxCanTake, types);
    }
}