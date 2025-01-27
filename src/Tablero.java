public class Tablero {
    public static int fila;
    public static int columna;
    public static void tiro(int fila, int columna){
        Tablero.fila =fila;
        Tablero.columna=columna;
        System.out.println(Tablero.fila+" "+
                Tablero.columna);
    }
    public static boolean comprobarFinPartida(){
        return false;
    }
}
