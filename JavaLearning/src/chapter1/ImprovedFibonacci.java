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
		String mark = "";
		
		FibonacciNumber[] fiboSeq = new FibonacciNumber[MAX_INDEX];
		FibonacciNumber fiboNum;
		
		fiboNum = new FibonacciNumber();
		fiboNum.setValue(lo);
		fiboSeq[MAX_INDEX-1] = fiboNum;
		for(int i = MAX_INDEX-2; i >= 0 ; i--){
			fiboNum = new FibonacciNumber();
			fiboNum.setValue(hi);
			fiboSeq[i] = fiboNum;
			if(hi % 2 == 0){
				mark = " *";
			}
			else{
				mark = "";
			}
			//System.out.println(i + ": " + hi + mark);
			hi = lo + hi;
			lo = hi - lo;
		}
		
		for(int i = 0; i < fiboSeq.length; i++){
			if(fiboSeq[i].getEven()){
				System.out.println((i+1) + ": " + fiboSeq[i].getValue() + mark);
			}
			else{
				System.out.println((i+1) + ": " + fiboSeq[i].getValue());
			}
		}
	}
}
