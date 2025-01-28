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
                    new Random().nextInt(8) + 1,
                    new Random().nextInt(8) + 1));
        }
    }

    public static void mostrarTablero() {
        int count=1;

        int[][] auxarray=arrayTablero;

        for ( List<Integer> valor : barcos.values()){
            auxarray[valor.getFirst()-1][valor.getLast()-1]=2;
        }
        System.out.println("  A B C D E F G H");
        for (int[] aux:auxarray){
            System.out.println((count++)+" "+Arrays.toString(aux)
                    .replaceAll("0","~")
                    .replaceAll("1","X")
                    .replaceAll(",","")
                    .replaceAll("]","")
                    .replaceAll("\\[","")
                    .replaceAll("2","@")
            );
        }
    }


    public static void tiro(int fila, int columna){
        Tablero.fila =fila;
        Tablero.columna=columna;
        //System.out.println(barcos);
        Integer aux=0;
        for (Integer clave : barcos.keySet()){
            if (barcos.get(clave).equals(Arrays.asList(fila, columna))){
                System.out.println("barco undido");
                aux=clave;
                arrayTablero[fila-1][columna-1]=1;

            }
        }
        if (barcos.containsKey(aux)){
            barcos.remove(aux);
        }else {
            System.out.println("golazo");
        }

        //System.out.println(barcos);

    }
    public static void mostrarEstadistica(){
        System.out.println("has undido "+(10- barcos.size())+" barcos");
    }
    public static boolean comprobarFinPartida(){
        return barcos.isEmpty();
    }
}
