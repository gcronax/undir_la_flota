import java.util.Scanner;

public class InterfazUsuario {
    Scanner scan =new Scanner(System.in);

    public int inputFila(){
        System.out.println("dame la fila");
        return scan.nextInt();
    }
    public int inputColumna(){
        System.out.println("dame la columna");
        return scan.nextInt();
    }




}
