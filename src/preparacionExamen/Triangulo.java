package preparacionExamen;

public class Triangulo {
	public static void imprimirPiramide(int filas) {
		int num = filas;
		
		for(int i = 1; i <= filas; i++) {
			for(int j = 1; j <= filas; j++) {
				if(j == num|| j == filas || i == filas) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			num--;
			System.out.println();
		}
		
	}
	
	public static void piramideInvertida(int filas) {
		int num = filas;
		
		for(int i = 0; i <= filas; i++) {
			for(int j = filas; j > 0; j--) {
				if(j <= num) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			num--;
			System.out.println();
		}
	}

	/*
	public static void Paola(int filas) {
		int n = filas;
		// creamos las filas
		for (int fila = 1; fila <= n; fila++) {
			for (int espacio = 1; espacio <= n - fila; espacio++) {
				System.out.print(" ");
			}
			for (int asterisco = 1; asterisco <= 2 * fila - 1; asterisco++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}*/
	
	public static void main(String[] args) {
		imprimirPiramide(5);
	}
}
