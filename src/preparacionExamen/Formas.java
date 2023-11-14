package preparacionExamen;

public class Formas {
	public static void Ventana(int lado) {
		for(int fila = 1; fila < lado; fila++) {
			for(int columna = 1; columna < lado; columna++) {
				
			}
		}
	}
	

    public static void Rombo (int ancho) {
        int nFilas = ancho;

        for(int fila = 0; fila <= ancho-1; fila++){
            for(int caracter = 0; caracter <= ancho; caracter++){
                 if(caracter >= nFilas){
                    System.out.print("* ");
                 }else {
                     System.out.print(" ");
                 }
            }
            nFilas--;
            System.out.println();
        }

        nFilas = ancho;

        for(int i = 0; i <= ancho; i++) {
            for(int j = ancho; j >= 0; j--) {
                if(j <= nFilas) {
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }
            }
            nFilas--;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Rombo(5);
    }
}
