package exercise;

import java.util.Scanner;

public class PartitionOfAList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter list: ");
		
		int[] list = new int[input.nextInt()];
		
		for(int i = 0; i < list.length; i++){
			list[i] = input.nextInt();
		}

	}
	
	public static int partition(int[] list){
		int pivot = list[0];
		int temp;
		int index = 0;
		int last = list.length - 1;
		
		for(int i = 1; i < list.length; i++){
			if(list[i] <= pivot){
				temp = list[i];
				list[i] = pivot;
				list[i - 1] = temp;
				index = i;
			}
			
			else if(list[i] > pivot && last > i){
				temp = list[i];
				list[i] = list[last];
				list[last] = temp;
				last -= 1;
				i--;
			}
			else
				break;
		}
		
		return index;
		
		
	}

}
