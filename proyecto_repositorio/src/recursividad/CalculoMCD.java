package recursividad;

public class CalculoMCD {
	
	public static int maxComDiv(int n, int m) {
//		if(n==m) {
//			return n;
//		}else if(n>m) {
//			return maxComDiv(n-m,m);
//		}else if(n<m) {
//			return maxComDiv(n,m-n);
//		}else {
//			return 0;
//		}
		
		if(n==m) return n;
		else if(n>m) return maxComDiv(n-m,m);
		else if(n<m) return maxComDiv(n,m-n);
		else return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(maxComDiv(3,7));
	}
}
