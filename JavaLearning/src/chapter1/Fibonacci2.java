package chapter1;

public class Fibonacci2 {
	static final int MAX = 50;
	public static final int SIZE = 9;
	
	/** Print the Fibonacci sequence for values < MAX */
	public static void main(String[] args){
		int[] sequence = new int[SIZE];
		
		int lo = 1;
		int hi = 1;
		int index = 0;
		sequence[index++] = hi;
		while(hi < MAX){
			sequence[index++] = hi;
			hi = lo + hi;
			lo = hi - lo;
		}
		
		for(int i = 0; i < sequence.length; i++){
			System.out.println(sequence[i]);
		}
	}
}
