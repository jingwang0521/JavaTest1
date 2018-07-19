package com.hand;

import java.util.ArrayList;
import java.util.List;

public class Exam1 {
	public static void main(String[] args) {
		int n = 200;
		System.out.print("102到200之间的素数共有"+getPrimeNumberToN(n).size()+",分别是");
		System.out.println(getPrimeNumberToN(n));
	}

	/**
	 * 得到1到n之间的素数，存到一个ArrayList集合
	 */
	private static List<Integer> getPrimeNumberToN(int n) {
		List<Integer> result = new ArrayList<>();
		for (int i = 102; i < n + 1; i++) {
			if (numberIsPrime(i)) {
				result.add(i);
			}
		}
		return result;
	}

	/**
	 * 判断一个数是不是素数：只能被1和本身整除
	 说明：从2开始除，不需要到n，也就是循环条件是 < n 就可以，这之间只要被整除了，那么他就不是素数了
	 */
	private static boolean numberIsPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}





