package chapter1;

public class FibonacciNumber {
	private int value;
	private boolean even;
	
	public FibonacciNumber(){
		
	}
	
	public int getValue(){
		return this.value;
	}
	
	public void setValue(int value){
		this.value = value;
		if(value % 2 == 0){
			setEven(true);
		}
		else{
			setEven(false);
		}
	}
	
	public boolean getEven(){
		return this.even;
	}
	
	public void setEven(boolean val){
		this.even = val;
	}

}
