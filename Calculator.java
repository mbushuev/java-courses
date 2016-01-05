/**
	Class realising calculator
*/

public class Calculator {
	
	/**
		Result of calculating
	*/
	private int result;
	
	/**
		Sum arguments
		@param params is arguments of summing
	*/
	public void add(int ... params){
		for (Integer param : params){
			this.result += param;
		}
	}
	
	/**
		Get result
		@return is result of computing
	*/
	public int getResult(){
		return this.result;
	}
	
	/**
		Clear computing result
	*/
	public void cleanResult(){
		this.result = 0;
	}
}