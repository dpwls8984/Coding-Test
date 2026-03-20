class Solution {
    public int solution(int n) {
        int answer = 0;
        /*
        10은 9로도 나눌 수 있고 나머지가 1이다.
        9의 약수는 1, 3, 9이다
        
        12는 11로 나눌 수 있고 나머지가 1이다.
        11의 약수는 1, 11이다.
        
        15은 14로 나눌 수 있고 나머지가 1이다.
        14의 약수는 1, 2, 7, 14이다
        가장 작은 자연수로 7을 반환해야한다.
        
        약수를 어떻게 계산해야 하며
        약수 중에서 3보다 크거나 같은 가장 작은 수를
        어떻게 반환해야할까?
                
        n: 15, n-1: 14
        i: 2, 3, 4, 5, 6, ... 14
        answer = 2

        n-1: 9
        i: 2, 3, 4, 5, 6, 7, 8
        answer = 3
        */
        
        for(int i = 2;i<=n;i++){
            if((n-1) % i == 0){
                answer = i;
                break;
            }else{
                answer = n-1;
            }
        }
        
        return answer;
    }
}