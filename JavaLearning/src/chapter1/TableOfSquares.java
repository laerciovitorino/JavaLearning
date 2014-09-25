package chapter1;

public class TableOfSquares {
	public static void main(String[] args){
		int in = 1;
		
		System.out.println("Table of squares of values from 1 through 10\n");
		while(in <= 10){
			System.out.println(in + "^2 = " + in * in);
			in++;
		}
	}
}
