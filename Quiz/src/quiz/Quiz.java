package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Quiz {
public static void main(String[] args) {
		
		Random ran=new Random();
				
		Set<Integer> st=new HashSet<>();
		
		int count=0;
		while(true) {		 
			count++;
			int ranNum=ran.nextInt(40);
			st.add(ranNum);
			if(st.size()==40) {
				break;
			}
		}
		List<Integer> nums=new ArrayList<>(st);
		Collections.sort(nums);
		for(int tmp:nums) {
			System.out.println(tmp-20);
		}
		
		
	}
}
