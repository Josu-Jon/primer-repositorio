package recursividad;

public class CalculoFactorial {
	public static int Factorial(int x) {
		if (x==0) {
			return 1;
		}else {
			return x * Factorial(x-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Factorial(5));
	}
}
