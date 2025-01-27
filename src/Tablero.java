import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Tablero {
    public static int fila;
    public static int columna;
    public static int[][] arrayTablero= new int[8][8];
    public static Map<Integer, String> barcos = new HashMap<Integer, String>();
    public static void crearPartida(){
        for (int i = 1; i <= 10; i++) {
            barcos.put(i,i+" "+(i+1) );
        }
    }




    public static void tiro(int fila, int columna){
        Tablero.fila =fila;
        Tablero.columna=columna;
        System.out.println(Tablero.fila+" "+
                Tablero.columna);

        System.out.println(barcos);
        if (barcos.containsValue(fila+" "+columna)){
            for ( )
            System.out.println(barcos);
        }
    }
    public static boolean comprobarFinPartida(){
        return false;
    }
}
