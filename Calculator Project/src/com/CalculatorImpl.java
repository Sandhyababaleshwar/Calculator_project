package com;

public  class CalculatorImpl implements Calculator {
	@Override
	public int add(int x,int y) {
		return x+y;
	}
	@Override
	public int sub(int x,int y) {
		return x-y;
	}
	@Override
	public int mul(int x,int y) {
		return x*y;
	}
	@Override
	public int div(int x,int y) {   // x=10  y=0   
		if(y!=0) {
			return x/y;
		}
		return -1;
	}
	@Override
	public String displayErrorMessage() {
		return "Invalid choice";
	}

}
