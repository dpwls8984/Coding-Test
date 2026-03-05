import java.util.*;

class Solution {
    public int solution(int[] nums) {        
        /* [3,3,3,2,2,4] 가 들어왔을 때 총 3마리를 선택하게 되고, 이 3마리를 선택하는 과정에서
        포켓몬 종류의 개수가 max인 값을 반환하면 된다.
        만약 [3,3,2,1,5,6,7,8] 가 들어오면 총 4마리를 선택하면되고, 
        이때 최대 포켓몬 종류의 개수는 3이다
        
        nums리스트를 하나씩 훑으면서 키를 하나씩 해시맵에 넣는데 
        만약에 같은 키가 해시맵에 이미 존재한다면 value + 1 하고
        존재하지 않는다면 default value = 0
        그러고나서 value 값이 가장 낮은 거 n/2개만큼 가져오기?
        
        즉 [3,3,3,2,2,4,4,1] 가 해시맵에 들어간다면 각 키의 value는 다음과 같겠지
        {3: 2, 2: 1, 4: 1, 1:0} 
        for문으로 해시맵 value 다 가져온 다음에 value 값 순으로 정렬할 수 있나? 
        아무튼 정렬이든 뭐든 가장 작은 값을 가진 순의 key를 n/2개만큼 return 하면된다
        */
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int n: nums) map.put(n, map.getOrDefault(n, 0)+1);
                
        int count = (int)map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue())
            .limit(nums.length / 2)
            .count();
        
        return count;
    }
}