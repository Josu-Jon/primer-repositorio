package recursividad;

public class Contar {
	public static void main(String[] args) {
		int n = 0;
		int m = 10;
		
		count(n,m);
	}
	
	public static void count(int n, int m) {
		System.out.println(n);
		if (n<m) {
			count(n+1,m);
		}
		System.out.println(n);
	}
}
