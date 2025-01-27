import java.lang.reflect.Array;
import java.util.*;

public class Tablero {
    public static int fila;
    public static int columna;
    public static int[][] arrayTablero= new int[8][8];
    public static Map<Integer, List<Integer>> barcos = new HashMap<Integer, List<Integer>>();
    public static void crearPartida(){
        for (int i = 1; i <= 10; i++) {
            barcos.put(i,Arrays.asList(
                    new Random().nextInt(10) + 1,
                    new Random().nextInt(10) + 1) );
        }
    }




    public static void tiro(int fila, int columna){
        Tablero.fila =fila;
        Tablero.columna=columna;
        System.out.println(barcos);
        Integer aux=0;
        for (Integer clave : barcos.keySet()){
            if (barcos.get(clave).equals(Arrays.asList(fila, columna))){
                System.out.println("barco encontrado");
                aux=clave;
            }
        }
        if (barcos.containsKey(aux)){
            barcos.remove(aux);
        }
        System.out.println(barcos);





    }
    public static boolean comprobarFinPartida(){
        return false;
    }
}
