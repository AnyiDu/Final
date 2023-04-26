import java.util.ArrayList;
import java.util.List;

public class Problem4 {
	public int[] shortestToChar(String s, char c) {
		//store indices first
		List<Integer> indices=new ArrayList<>();
		//resulting array, same length as s
		int[] answer=new int[s.length()];

		//grab indices first
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==c){
				indices.add(i);
			}

		}

		//for finding min, initialize it with max value
		int min=Integer.MAX_VALUE;

		for(int i=0;i<s.length();i++){
			for(int j=0;j<indices.size();j++){
				//Abs -> so that char that is before the indice/ocurence of char in s is considered else it will not consider it
				//as the indice value - index will be -ve
				min=Math.min(Math.abs(indices.get(j)-i),min);
			}
			answer[i]=min;
			//again initialize it to MAX value for next round of calculations
			//otherwise it will always give 0 as result after some iterations
			min=Integer.MAX_VALUE;
		}

		return answer;
	}
}
