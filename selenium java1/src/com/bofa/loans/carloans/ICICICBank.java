package com.bofa.loans.carloans;

public class ICICICBank implements RBI {
	int a = 500;
	public void m1()
	{
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		ICICICBank r = new ICICICBank ();
		System.out.println(r.a);
		r.m1();
		r.m2();
		
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() { 
		// TODO Auto-generated method stub
		System.out.println("Hello RBI");
		
	}

}
