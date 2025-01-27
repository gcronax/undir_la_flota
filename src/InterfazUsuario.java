import java.util.Scanner;

public class InterfazUsuario {
    static Scanner scan =new Scanner(System.in);

    public static int inputFila(){
        System.out.println("dame la fila");
        return scan.nextInt();
    }
    public static int inputColumna(){
        System.out.println("dame la columna");
        return scan.nextInt();
    }

}
