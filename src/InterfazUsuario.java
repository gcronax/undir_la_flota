import java.util.Scanner;

public class InterfazUsuario {
    static Scanner scan =new Scanner(System.in);

    public static int inputFila(){
        System.out.print("Dame la fila: (1-8) -> ");
        return scan.nextInt();
    }
    public static String inputColumna(){
        System.out.print("Dame la columna (A-H) -> ");
        return scan.next().toUpperCase();
    }

}
