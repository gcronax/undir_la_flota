import java.lang.management.ManagementFactory;
import java.util.Arrays;

public class HundirLaFlota {
    public static void main(String[] args) {
        Tablero.crearPartida();

        do{
            if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().contains("-agentlib:jdwp")){
                Tablero.mostrarTablero();
            }
            int count=1;
            System.out.println("_________________________");
            System.out.println("   A  B  C  D  E  F  G  H");
            for (int[] aux:Tablero.arrayTablero){
                System.out.println((count++)+" "+Arrays.toString(aux)
                        .replaceAll("0","\uD83C\uDF0A")
                        .replaceAll(",","")
                        .replaceAll("]","")
                        .replaceAll("\\[","")
                        .replaceAll("2","\uD83C\uDF0A")
                        .replaceAll("1","❌")
                        .replaceAll("5","⭕")

                );
            }
            Tablero.mostrarEstadistica();

            int fila=InterfazUsuario.inputFila();
            char columna=InterfazUsuario.inputColumna();
            int columnaint = 0;
            switch (columna){
                case 'A':
                    columnaint=1;
                    break;
                case 'B':
                    columnaint=2;
                    break;
                case 'C':
                    columnaint=3;
                    break;
                case 'D':
                    columnaint=4;
                    break;
                case 'E':
                    columnaint=5;
                    break;
                case 'F':
                    columnaint=6;
                    break;
                case 'G':
                    columnaint=7;
                    break;
                case 'H':
                    columnaint=8;
                    break;
                default:
                    System.out.println("Da un valor valido");
                    break;

            }


            Tablero.tiro(fila,columnaint);

        }while (!(Tablero.comprobarFinPartida()));

        System.out.println("Has Ganado! :D");
    }

}
