package main;

public class MyInteger {
	private int iValue;
	
	MyInteger(int newValue) {
		iValue = newValue;
	}
	
	public int getValue() {
		return iValue;
	}
	
	public void setValue(int value) {
		this.iValue = iValue;
	}

	int get() {
		return iValue;
	}
	
	boolean isEven() {
		if ((this.iValue % 2) == 0) {
			return true;
		}
		return false;
		
	}
	
	boolean isOdd(){
		if ((this.iValue % 2) == 1){
			return true;
			
		}
		return false;
		
	}
	
	boolean isPrime(){
		for (int i = 2; i <= this.iValue /2; i++){
			if (this.iValue % i == 0){
				return false;
			}
		}
	   return true;
	
	}
	
	static boolean isEven(int value) {
		if ((value % 2) == 0) {
			return true;
		}
		return false;
	}

	static boolean isOdd(int value) {
		if ((value % 2) != 0) {
			return true;
		}
		return false;
	}

	static boolean isPrime(int value) {
		for (int i = 2; i <= value / 2; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	static boolean isEven(MyInteger integer) {
		if ((integer.getValue() % 2) == 0) {
			return true;
		}
		return false;
	}

	static boolean isOdd(MyInteger integer) {
		if ((integer.getValue() % 2) != 0) {
			return true;
		}
		return false;
	}

	static boolean isPrime(MyInteger integer) {
		for (int i = 2; i <= integer.getValue() / 2; i++) {
			if (integer.getValue() % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	boolean equals(int specifiedValue) {
		if (this.iValue == specifiedValue) {
			return true;
		}
		return false;
	}

	boolean equals(MyInteger integer) {
		if (integer.getValue() == this.iValue) {
			return true;
		}
		return false;
	}
	

}
