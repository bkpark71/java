package challenge.two;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		int result;
		int n;
		Scanner in = new Scanner(System.in);

		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = in.nextInt();

		result = factorial(n);
		System.out.println(result);
	}

	static int factorial(int x) {
		int r = 1;
		while (x > 0) {
			r *= x--;
		}
		return r;
	}
}
