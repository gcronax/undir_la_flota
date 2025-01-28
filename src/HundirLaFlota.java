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

            int fila=InterfazUsuario.inputFila();
            String columna=InterfazUsuario.inputColumna();
            int columnaint = 0;
            switch (columna){
                case "A":
                    columnaint=1;
                    break;
                case "B":
                    columnaint=2;
                    break;
                case "C":
                    columnaint=3;
                    break;
                case "D":
                    columnaint=4;
                    break;
                case "E":
                    columnaint=5;
                    break;
                case "F":
                    columnaint=6;
                    break;
                case "G":
                    columnaint=7;
                    break;
                case "H":
                    columnaint=8;
                    break;
                default:
                    break;

            }


            Tablero.tiro(fila,columnaint);

        }while (!(Tablero.comprobarFinPartida()));

        System.out.println("has ganado");
    }

}
