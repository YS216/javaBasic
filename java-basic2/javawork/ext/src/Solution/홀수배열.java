package Solution;

public class 홀수배열 {
	public int[] solution(int n) {
        int[] answer = {};
        
        for(int i = 0; i < answer.length; i++) {
            if(answer[i] % 2 != 0){
                answer[i] = i;
            }
        }
        return answer;
    }

}
