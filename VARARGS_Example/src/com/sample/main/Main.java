package com.sample.main;
import com.sample.classes.Process;
public class Main {

	public static void main(String[] args) {
		Process p1 = new Process();
		double sample1=p1.mean(1,2); //Gives 1.5   and not what it 1.0
		System.out.println(sample1); System.out.println();
		
		Process p2 = new Process();
		System.out.println(p2.simplerMean(1,2));
		System.out.println(p2.simplerMean(1,2,3));
		System.out.println(p2.simplerMean(1,2,4));

	}

}

/*
VARARGS (variable-length arguments) - Simplifies handling a variable number of arguments in methods especially when you don’t know in advance how many arguments the method will receive.
Instead of writing multiple overloaded methods for different numbers of parameters, you can use a single method that accepts a flexible number of arguments (easily iterating over them) of the same type and have cleaner syntax
Helps by allowing a method to accept an infinte number of arguments (Compiler automatically creates an array), reducing the need for multiple overloaded methods, making code more concise and flexible.
	Method can only have one VARARGS parameter & MUST BE the last parameter
	DEFINI 	  public void example(int a, String b, int... numeros) { }	//	public double simplerMean(int... numeros) {	
*/