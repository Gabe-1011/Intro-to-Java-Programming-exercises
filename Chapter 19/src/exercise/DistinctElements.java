package exercise;

import java.util.ArrayList;

public class DistinctElements {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(4);
		list1.add(4);
		list1.add(10);
		
		ArrayList<Integer> list2 = removeDuplicates(list1);
		System.out.println(list2.toString());

	}
	
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
		for(int i = 0; i < list.size(); i++){
			for(int j = i + 1; j < list.size(); j++){
				if(list.get(i).equals(list.get(j))){
					list.remove(i);
				}
			}
		}
		return list;
	}

}
