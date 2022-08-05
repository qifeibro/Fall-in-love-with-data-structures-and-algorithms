package com.dc;

import com.dc.TimeTool.Task;

public class Main {

	/**
	 * 0 1 1 2 3 5 8 13 ...
	 */
	
	// O(2^n)
	public static int fib1(int n) {
		if (n <= 1) return n;
		return fib1(n - 1) + fib1(n -2);
	}
	
	// O(n)
	public static int fib2(int n) { // 必须有 static ，因为 Cannot make a static reference to the non-static method fib2(int) from the type Main
		if (n <= 1) return n;
		int first = 0;
		int second = 1;
		for (int i = 0; i < n - 1; ++i) {
			int sum = first + second;
			first = second;
			second = sum;
		}
		return second;
	}
	
	public static void main(String[] args) {
		int n = 42;
		//System.out.println(fib1(44)); // syso + 回车
		TimeTool.check("fib1", new Task() { // Ctrl + 1 导入
			public void execute() {
				System.out.println(fib1(n));
			}
		});
		
		TimeTool.check("fib2", new Task() {
			public void execute() {
				System.out.println(fib2(n));
			}
		});
	}

}