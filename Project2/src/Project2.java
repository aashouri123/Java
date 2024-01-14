
public class Project2{	
	
		public static int getPentagonalNumber(int n) {
			
			int count = 1;
			int pentagonal = 0;
			
			while(count <= n) {
				pentagonal = (count*(3*count - 1)/2); 	//equation for next number in sequence
				System.out.printf("%7d",pentagonal); 	//print specific format
				
				if (count % 10 == 0) 	// once the number of columns reached 10
					System.out.print("\n");		// start a new line

				count++;			
			};
			return pentagonal;
		};

	public static void main(String[] args) {
			getPentagonalNumber(100);
		};
	};


