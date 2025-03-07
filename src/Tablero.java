import java.lang.reflect.Array;
import java.util.*;

public class Tablero {
    public static int fila;
    public static int columna;
    public static int[][] arrayTablero= new int[8][8];
    public static Map<Integer, List<Integer>> barcos = new HashMap<Integer, List<Integer>>();
    private static int count=0;
    public static void crearPartida(){
        int i=1;
        do {
            int fila =new Random().nextInt(8) + 1;
            int columna=new Random().nextInt(8) + 1;
            if (!barcos.containsValue(Arrays.asList(fila,columna))){

                barcos.put(i++,Arrays.asList( fila,columna ));
            }



        }while (barcos.size()!=10);
        //System.out.println(barcos.size());

    }
    public static void mostrarTablero() {
        int count=1;

        int[][] copiaTablero=arrayTablero;

        for ( List<Integer> valor : barcos.values()){
            copiaTablero[valor.getFirst()-1][valor.getLast()-1]=2;
        }
        System.out.println("   A  B  C  D  E  F  G  H");
        for (int[] printAux:copiaTablero){
            System.out.println((count++)+" "+Arrays.toString(printAux)
                    .replaceAll("0","\uD83C\uDF0A")
                    .replaceAll(",","")
                    .replaceAll("]","")
                    .replaceAll("\\[","")
                    .replaceAll("2","⛵")
                    .replaceAll("1","⛵")
                    .replaceAll("5","\uD83C\uDF0A")


            );
        }
    }


    public static void tiro(int fila, int columna){
        count++;
        Tablero.fila =fila;
        Tablero.columna=columna;
        //System.out.println(barcos);
        Integer aux=0;
        arrayTablero[fila-1][columna-1]= 5;

        for (Integer clave : barcos.keySet()){
            if (barcos.get(clave).equals(Arrays.asList(fila, columna))){
                System.out.println("X Barco Hundido X");
                aux=clave;
                arrayTablero[fila-1][columna-1]=1;

            }
        }
        if (barcos.containsKey(aux)){
            barcos.remove(aux);
        }else {
            System.out.println("AGUA CAMPEÓN ;)!");
        }

        //System.out.println(barcos);

    }
    public static void mostrarEstadistica(){
        System.out.println(count+" intentos y  faltan "+(barcos.size())+" barcos.");
    }
    public static boolean comprobarFinPartida(){
        return barcos.isEmpty();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
