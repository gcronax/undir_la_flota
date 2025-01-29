import java.util.Scanner;

public class InterfazUsuario {
    static Scanner scan =new Scanner(System.in);

    public static int inputFila(){
        System.out.print("Dame la fila: (1-8) -> ");
        int aux=scan.nextInt();
        if (aux<1||aux>8){
            System.out.println("Da un valor valido");
            return inputFila();
        }
        return aux;
    }
    public static char inputColumna(){
        System.out.print("Dame la columna (A-H) -> ");
        char aux=scan.next().charAt(0);

        if (aux < 'A' || aux > 'H'){
            System.out.println("Da un valor valido");
            return inputColumna();
        }
        return aux;
    }

}
