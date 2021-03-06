package chapter1;

public class Fibonacci {
	static final String TITLE = "Fibonacci sequence for values < 50\n";
	
	/** Print out the Fibonacci sequence for values < 50 */
	public static void main(String[] args){
		int lo = 1;
		int hi = 1;
		
		System.out.println(TITLE);
		System.out.println(lo);
		while(hi < 50){
			System.out.println(hi);
			hi = lo + hi;	// new hi
			lo = hi - lo;	/* new lo is (sum - old lo)
							   that is, the old hi */
		}
	}
}
