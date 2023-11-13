package preparacionExamen;

public class Formas {

    public static void Rombo (int ancho) {
        int nFilas = ancho;

        for(int fila = 0; fila <= ancho; fila++){
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
            for(int j = ancho; j > 0; j--) {
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
