/*
 * File: Fibonacci.java
 * --------------------
 * This program lists the terms in the Fibonacci sequence up
 * to a constant MAX_TERM_VALUE, which is the largest Fibonacci term
 */ 

import acm.program.ConsoleProgram;


public class Fibonacci extends ConsoleProgram {
	public void run(){
		println("This program lists the Fibonacci sequence.");
		int t1 = 0;
		int t2 = 1;
		int MAX_TERM_VALUE = 10000;
		while (t1 <= MAX_TERM_VALUE){
			println(t1);
			int t3 = t1 + t2;
			t1 = t2;
			t2 = t3;
		}
	}
}
