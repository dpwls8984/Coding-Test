import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        //각 장르별 고유번호와 재생횟수 넣는 map
        Map<String, List<int[]>> songsByGenre = new HashMap<>();
        
        //장르별 재생횟수 넣는 map
        Map<String, Integer> totalPlays = new HashMap<>();
        
        //마지막에 최종적으로 정렬된 곡의 고유번호를 리턴
        
        for(int i=0;i<genres.length;i++){
            String genre = genres[i];
            int play = plays[i];
            
            totalPlays.put(genre, totalPlays.getOrDefault(genre, 0)+play);
            
            if(!songsByGenre.containsKey(genre)){
                songsByGenre.put(genre, new ArrayList<>());
            }
            songsByGenre.get(genre).add(new int[]{i, play});
        }
        
        // 장르 총 재생수 기준 내림차순 정렬
        List<String> sortedGenres = new ArrayList<>(totalPlays.keySet());
        
        sortedGenres.sort((a, b) -> totalPlays.get(b) - totalPlays.get(a));

        // 장르별 상위 2곡 선택
        List<Integer> answer = new ArrayList<>();
        for (String genre : sortedGenres) {
            List<int[]> songs = songsByGenre.get(genre);

            // [인덱스, 재생수] 기준 정렬
            songs.sort((a, b) ->
                a[1] != b[1] ? b[1] - a[1] : a[0] - b[0]);

            for (int i = 0; i < Math.min(2, songs.size()); i++) {
                answer.add(songs.get(i)[0]);  // 인덱스 추가
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}