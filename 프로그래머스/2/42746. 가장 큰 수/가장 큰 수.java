import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] arr = new String[numbers.length];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < numbers.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(arr, (a, b) -> (b+a).compareTo(a+b));
        /* 
        6, 10, 2
        
        a: 6, b: 10
        106.compareTo(610)
        106<610
        
        6, 10
        
        a: 10, b: 2
        210.compareTo(102)
        210>102 -> 210이 앞에 간다
        
        2, 10
        
        즉 6, 2, 10
        a: 6, b: 2
        26.compareTo(62)
        26<62
        
        6, 2, 10
        
        ---
        Arrays.sort(arr, (a, b) -> (a + b).compareTo(b+a));

        6, 10, 2
        
        a: 6, b: 10
        610.compareTo(106)
        610 > 106
        6, 10
        
        10, 2
        a: 10, b: 2
        102.compareTo(210)
        102 < 210
        
        2, 10
        
        */
        if(arr[0].equals("0")){
            return "0";
        }
        
        for(String a: arr) sb.append(a);
        
        return sb.toString();
    }
}