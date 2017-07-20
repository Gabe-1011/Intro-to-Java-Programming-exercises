package exercise114;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxElementArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Enter values (input ends with 0)");
		Integer newValue = input.nextInt();
		while(newValue.intValue() != 0){
			list.add(newValue);
			newValue = input.nextInt();
		}
		
		System.out.println(list.toString());
		
		System.out.println("Max value of list is: " + max(list));

	}
	
	public static Integer max(ArrayList<Integer> list){
		if(list.size() == 0)
			return null;
		
		Integer max = list.get(0);
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) > max)
				max = list.get(i);
		}
		return max;
	}

}
