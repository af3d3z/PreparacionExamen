package preparacionExamen;

public class Cuadrado {
	public static void imprimirCuadrado(int ancho) {
		for(int i = 0; i <= ancho; i++) {
			for(int j = 0; j <= ancho; j++) {
				if(i == 0 || i == ancho || (j == 0 || j == ancho)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void imprimirCuadradoPirata(int ancho) {
		int x = 0;
		
		for(int i = 0; i <= ancho; i++) {
			for(int j = 0; j <= ancho; j++) {
				if(i == 0 || i == ancho || (j == 0 || j == ancho)) {
					System.out.print("* ");
				}else if(j == x || (ancho - x) == j){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
			x++;
		}
	}
	
	
	
	public static void main(String[] args) {
		imprimirCuadradoPirata(6);
	}
}
