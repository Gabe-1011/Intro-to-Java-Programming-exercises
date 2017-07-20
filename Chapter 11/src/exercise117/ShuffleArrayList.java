package exercise117;

import java.util.ArrayList;

public class ShuffleArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(6);
		list.add(3);
		list.add(14);
		list.add(15);
		list.add(2);
		
		shuffle(list);
		
		System.out.println(list.toString());

	}
	
	public static void shuffle(ArrayList<Integer> list){
		for(int i = 0; i < list.size(); i++){
			int currentIndex = list.indexOf(list.get(i));
			int newIndex = (int)(Math.random() * list.size());
			list.add(newIndex, list.get(currentIndex));
			list.remove(list.get(currentIndex));
		}
	}

}
