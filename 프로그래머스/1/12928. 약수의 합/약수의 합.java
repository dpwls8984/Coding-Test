import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return IntStream
            .rangeClosed(1, n)
            .parallel()
            .filter(i -> n%i ==0)
            .sum();
    }
}