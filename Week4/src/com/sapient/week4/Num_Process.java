package com.sapient.week4;

public interface Num_Process {
	abstract int call(int a,int b);
}

class Addition implements Num_Process{

	@Override
	public int call(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}

class Multiply implements Num_Process{

	@Override
	public int call(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
}

class Divide implements Num_Process{

	@Override
	public int call(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	
}

class Subtract implements Num_Process{

	@Override
	public int call(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
}

