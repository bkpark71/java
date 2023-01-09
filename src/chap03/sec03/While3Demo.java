package sec03;

public class While3Demo {
	public static void main(String[] args) {
		float f = 0.1f;
		do {
			System.out.printf("%.1f\n", f);
			f += 0.1f;
		} while (f != 1.0f);
	}
}
