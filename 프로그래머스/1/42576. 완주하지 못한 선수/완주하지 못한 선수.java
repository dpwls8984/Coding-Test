import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> participantMap = new HashMap<>();
        
        for(String p: participant) 
            participantMap.put(p, participantMap.getOrDefault(p, 0)+1);

        for(String c: completion)
            participantMap.put(c, participantMap.get(c)-1);
        
        for(String key: participantMap.keySet()){
            if(participantMap.get(key)!=0){
                answer = key;
                break;
            } 
        }
        return answer;
    }
}