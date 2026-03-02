import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        //commands의 첫번째 배열 하나씩 불러와서,
        //i부터 j까지 값을 자른 뒤에 
        //그 배열을 정렬하고,
        //정렬한 배열의 k번째 숫자 반환해야한다.
        
        //commands의 길이가 이중배열의 개수를 말하는 거였다!!
        //만약 이중배열의 실제 원소를 반환하고싶다면 commands[i].length 하면 됨
        for(int i=0;i<commands.length;i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];
            
            int[] subArray = Arrays.copyOfRange(array, start-1, end);
            Arrays.sort(subArray);
            answer[i]=subArray[k-1];
        }
        
        
        return answer;
    }
}