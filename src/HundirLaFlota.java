import java.util.Arrays;

public class HundirLaFlota {
    public static void main(String[] args) {
        Tablero.crearPartida();

        do{
            Tablero.mostrarTablero();
            int count=1;
            System.out.println("_________________");
            System.out.println("  A B C D E F G H");
            for (int[] aux:Tablero.arrayTablero){
                System.out.println((count++)+" "+Arrays.toString(aux)
                        .replaceAll("0","~")
                        .replaceAll("1","X")
                        .replaceAll(",","")
                        .replaceAll("]","")
                        .replaceAll("\\[","")
                        .replaceAll("2","~")
                );
            }
            Tablero.mostrarEstadistica();
            Tablero.tiro(
                    InterfazUsuario.inputFila(),
            InterfazUsuario.inputColumna());

        }while (!(Tablero.comprobarFinPartida()));
    }



}
