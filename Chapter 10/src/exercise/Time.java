package exercise;

public class Time {
	public long hour;
	public long minute;
	public long second;
	
	public Time(){
		this(0);
	}
	
	public Time(long elapsedTime){
		setTime(elapsedTime);
	}
	
	public Time(long hour, long minute, long second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public long getHour() {
		return hour;
	}

	public void setHour(long hour) {
		this.hour = hour;
	}

	public long getMinute() {
		return minute;
	}

	public void setMinute(long minute) {
		this.minute = minute;
	}

	public long getSecond() {
		return second;
	}

	public void setSecond(long second) {
		this.second = second;
	}
	
	public void setTime(long elapsedTime){
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		
		second = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		minute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		hour = totalHours % 24;
		
		if(elapsedTime > 0){
			totalSeconds = elapsedTime / 1000;
			second += totalSeconds % 60;
			totalMinutes = totalSeconds / 60;
			minute += totalMinutes % 60;
			totalHours = totalMinutes / 60;
			hour += totalHours % 24;
		}
		
	}

}
