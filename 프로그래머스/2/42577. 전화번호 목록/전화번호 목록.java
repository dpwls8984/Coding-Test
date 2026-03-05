import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        //폰 북에 있는 전화번호 하나하나를 일단 해시맵에 넣어야한다.
        //어떤 번호 a가 다른 번호 b의 접두사인 경우, 즉 번호 b가 a로 시작하는경우
        //번호 b의 초반이 번호 a와 똑같을 경우 접두어인 경우가 있는 것이다.
        //접두어인 경우가 있으면 false, 그렇지 않으면 true return
        Map<String, Integer> map = new HashMap<>();
        for(String p: phone_book) map.put(p, 1);
        
        /*
        지금 해시맵에 들어가있는 상황: ["12","123","1235","567","88"], 각각이 key
        어떻게 번호1이 번호2의 접두어라는 걸 판단할 수 있을까?
        키를 하나씩 꺼내고, 그 키를 다른 키와 비교하면서 contains를 만족하는지를 검증하기에는
        contains는 말그대로 존재하는가만 판단하기 때문에 숫자가 "23412" 여도 true를 반환한다.
        따라서 어폐가 있다. 그렇다면 번호 23412의 앞부분부터 length-1까지 하나씩 잘라가며
        2, 23, 234, 2341 이렇게 하나씩 늘려나가면서 그 값이 키로서 hashmap에 존재하는지 찾아봐야한다.
        ["12","123","1235","567","88"]
        */
        
        for(String p:phone_book){
           for(int i=0;i<p.length();i++){ 
               String prefix = p.substring(0, i);
               if(map.containsKey(prefix)) return false;
            } 
        }

        
        return true;
    }
}