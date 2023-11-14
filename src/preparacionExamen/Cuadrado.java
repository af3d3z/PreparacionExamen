package preparacionExamen;

public class Cuadrado {
	public static void imprimirCuadrado(int lado) {
		for(int i = 0; i < lado; i++) {
			for(int j = 0; j < lado; j++) {
				if(i == 0 || i == lado-1 || (j == 0 || j == lado -1)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void imprimirCuadradoPirata(int lado) {
		int x = 0;

		for(int i = 0; i <= lado; i++) {
			for(int j = 0; j <= lado; j++) {
				// se encarga de imprimir los lados del cuadrado
				if(i == 0 || i == lado || (j == 0 || j == lado)) {
					System.out.print("* ");
				}else if(j == x || (lado - x) == j){ // imprime los asteriscos que conforman la equis
					System.out.print("* ");
				}else {// imprime los espacios para que el cuadrado tenga forma
					System.out.print("  ");
				}
			}
			System.out.println();
			x++;
		}
	}
	
	
	
	public static void main(String[] args) {
		imprimirCuadrado(9);
	}
}
