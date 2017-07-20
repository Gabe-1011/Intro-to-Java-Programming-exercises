package exercise;

public class TestTime {

	public static void main(String[] args) {
		Time time1 = new Time();
		Time time2 = new Time(555550000);
		
		System.out.println("The time for time 1 is: \n" +
				time1.getHour() + " hours \n" + time1.getMinute()+
				" minutes \n" + time1.getSecond() + " seconds.");
		
		System.out.println("The time for time 2 is: \n" +
				time2.getHour() + " hours \n" + time2.getMinute()+
				" minutes \n" + time2.getSecond() + " seconds.");
		
		

	}

}
