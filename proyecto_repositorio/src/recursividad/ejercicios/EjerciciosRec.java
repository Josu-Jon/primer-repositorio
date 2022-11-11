package recursividad.ejercicios;

public class EjerciciosRec {
	public static boolean esPalindromo(String texto) {
		if (texto.length()<=1) return true;
		if (texto.charAt(0) != texto.charAt(texto.length()-1)) return false;
		return esPalindromo(texto.substring(1, texto.length()-1));
	}
	public static void imprimirStrBinarios (String str) {
		if (!str.contains("b")) {
			System.out.println(str);
		}else {
		imprimirStrBinarios(str.replaceFirst("b", "0"));
		imprimirStrBinarios(str.replaceFirst("b", "1"));
		}
	}
	public static void main(String[] args) {
		System.out.println(esPalindromo("a"));
		System.out.println(esPalindromo("ab"));
		System.out.println(esPalindromo("aa"));
		System.out.println(esPalindromo("aba"));
		System.out.println(esPalindromo("abb"));
		System.out.println(esPalindromo("abab"));
		imprimirStrBinarios("1bbb0b");
	}
}
