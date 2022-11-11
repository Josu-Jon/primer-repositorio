package recursividad;

public class CalcularFibonaci {
	
	public static int fibo(int n) {
		if (n==0) return 0;
		if (n==1) return 1;
		else return fibo(n-1) + fibo(n-2);
	}
	
	public static void main(String[] args) {
		System.out.println(fibo(0));
		System.out.println(fibo(1));
		System.out.println(fibo(2));
		System.out.println(fibo(3));
		System.out.println(fibo(4));
		System.out.println(fibo(5));
		System.out.println(fibo(6));
	}
}
