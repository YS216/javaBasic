package Solution;

import java.util.Arrays;

public class mid {
	    public int solution(int[] array) {
	        int answer = 0;
	        
	        Arrays.sort(array);
	        answer = array[array.length/2];
	        
	        return answer;
	    }

}
