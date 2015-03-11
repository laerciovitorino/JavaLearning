package chapter1;

public class ImprovedFibonacci {
	
	static final int MAX_INDEX = 9;
	
	/**
	 * Print out the first few Fibonacci numbers,
	 * making evens with a '*'
	 */
	public static void main(String[] args){
		int lo = 1;
		int hi = 1;
		String mark;
		
		System.out.println("9: " + lo);
		for(int i = MAX_INDEX-1; i >= 1 ; i--){
			if(hi % 2 == 0){
				mark = " *";
			}
			else{
				mark = "";
			}
			System.out.println(i + ": " + hi + mark);
			hi = lo + hi;
			lo = hi - lo;
		}
	}
}
