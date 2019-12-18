package com.rathinam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Jesus {

	public static void main(String[] args) {
		System.out.println("Jesus is my god");
		
		
		System.out.println("before");
	System.gc();
	System.out.println("after");
		
		testInterface ti = (str)->{
			System.out.println("Family is important");
			
			System.out.println(str);
		};
		
		

		
		ti.printMessage("Jesus is my saviour");
		sampleLambda(ti);
		
	}
	
	 public void finalize() {
		 System.out.println("Garbage collector");
	 }
	
	public static void sampleLambda(testInterface ti) {
		ti.printMessage("Thomas David");
		
	}

}
