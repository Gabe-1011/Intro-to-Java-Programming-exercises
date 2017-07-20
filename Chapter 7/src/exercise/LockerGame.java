package exercise;

public class LockerGame {

	public static void main(String[] args) {
		String[] lockers = new String[100];
		
		// Close all lockers
		closeAllLockers(lockers);
		
		// Invoke the studentLockerChanges method
		studentLockerChanges(lockers);
		
		// Display all open lock numbers
		print(lockers);

	}
	
	public static boolean isOpen(String l){
		return l == "OPEN";
	}
	
	public static void closeAllLockers(String[] lockers){
		for(int i = 0; i < lockers.length; i++){
			lockers[i] = "CLOSED";
		}
	}
	
	public static void studentLockerChanges(String[] lockers){
		int start = 0;
		
		for(int s = 1; s <= lockers.length; s++){
			for(int l = 0; l < lockers.length; l += s){
				if(isOpen(lockers[l]))
					lockers[l] = "CLOSED";
				else
					lockers[l] = "OPEN";
			}
			start++;
		}
	}
	
	public static void print(String[] lockers){
		for(int i = 0; i < lockers.length; i++){
			if(isOpen(lockers[i])){
				System.out.println("L" + (i + 1) + " ");
			}
		}
		System.out.println();
	}

}
