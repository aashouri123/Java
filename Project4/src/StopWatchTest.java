import java.util.Random;

public class StopWatchTest{
    public static void main(String[] args) {
    	
        Random r = new Random();
        
        int nums[] = new int[100000]; //array to hold 100000 numbers
        
        for(int i = 0; i < nums.length; i++) { //this loop generates 100000 numbers and store them in array
        	nums[i] = r.nextInt(10000);
        }

        StopWatch stopWatch = new StopWatch(); // a stopwatch constructor
        
        selectionSort(nums); // sorting algo to sort the arrayfrom min to max
        
        stopWatch.stop(); //using the stop method from stopwatch class to stop the time elapsed

        System.out.println("Time to Sort: " + stopWatch.getElapsedTime() + " milliseconds"); // returns elasped time.
    }

    public static void selectionSort(int[] list) { // selection sort algorithm
        for (int i = 0; i < list.length; i++) { 	// first loop captures the first element in array and declares it as min
            int currentMin = list[i]; 
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) { // second loop compres the first element with the next one
                if (currentMin > list[j]) {	// if the current is greater than the next elemnt
                    currentMin = list[j];	// reinitallize the next elemnt to current min
                    currentMinIndex = j; // reintiallize the min index to j
                }
            }   

            if (currentMinIndex != i) { // if statment to sort elements of the array
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
