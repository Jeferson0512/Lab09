package com.tecsup.lab11.junit;

public class Application {
	
	public static void main(String[] args) {
		Application app = new Application();
		
		int sum = app.suma(4,5);
		int res = app.resta(4,5);
		int multi = app.multi(4,5);
		int divi = app.divi(5,3);
	}
	 
	public int resta(int a, int b){
		
		return a-b;
		
	}
	
	public int suma(int a, int b){
		
		return a+ b;
	}
	
	public int multi(int a, int b){
		return a*b;
	}
	
	public int divi(int a, int b){
		return a/b;
	}

}
