
class StopWatch {
	
	private long startTime = System.currentTimeMillis();
    private long endTime = startTime;


    public StopWatch() { //initailizing the stopwatch class
    }

    public long getStartTime() { //method that return the start time
        return this.startTime;
    }

    public long getEndTime() { //method that returns the end time
        return this.endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis(); 
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() { //mthod that returns the elapsed time.
        return this.endTime - this.startTime;
    }
}

