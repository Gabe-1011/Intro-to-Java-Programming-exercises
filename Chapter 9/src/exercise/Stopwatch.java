package exercise;

public class Stopwatch {
	private long startTime;
	private long endTime;
	
	public Stopwatch(){
		startTime = System.currentTimeMillis();
	}
	
	public long start(){
		return this.startTime = System.currentTimeMillis();
	}
	
	public long stop(){
		return this.endTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime(){
		return getEndTime() - getStartTime();
	}
	
	public long getStartTime(){
		return startTime;
	}
	
	public long getEndTime(){
		return endTime;
	}

}
