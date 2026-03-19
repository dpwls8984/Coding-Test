import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        StringBuffer stringBuffer = new StringBuffer();
        
        for(int i=0;i<numbers.length;i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        if(arr[0].equals("0")){
            return "0";
        }
        
        for(String a: arr){
            stringBuffer.append(a);
        }
        
        /* 
        o1: 30, o2: 9
        o1, o2 -> (o2 + o1).compareTo(o1 + o2)
        
        930 > 309 -> (+) ->  -> o1, o2 중에서 o2가 앞에감
        9, 30
        
        
        o1: 30, o2: 9
        
        309.compareTo(930)
        309 < 930 -> 뒤에 값이 더 크다 (-) -> 앞에 값(o1)부터 쓴다
        30, 9
        */
        
        
        return stringBuffer.toString();
    }
}