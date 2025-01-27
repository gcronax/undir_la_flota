import java.util.Scanner;

public class InterfazUsuario {
    static Scanner scan =new Scanner(System.in);

    public static int inputFila(){
        System.out.print("dame la fila: ");
        return scan.nextInt();
    }
    public static int inputColumna(){
        System.out.print("dame la columna: ");
        return scan.nextInt();
    }

}
