package com.sample.classes;

public class Process {
	public double mean (int x1, int x2) {
	    double anws = (x1+x2)/2;
	    return anws;
	}

	public double mean (int x1, int x2, int x3) {
	    double anws = (x1+x2+x3)/3;
	    return anws;
	}

	public double mean (int x1, int x2, int x3, int x4) {
	    double anws=(x1+x2+x3+x4)/4;
	    return anws;
	}
	
	public double simplerMean(int... numeros) {
	    int sum=0;
	    double result=0;
	    for(int x : numeros)
	    {
	        sum+=x;
	    }
	    result=sum/numeros.length;
	    return result;
	}
}