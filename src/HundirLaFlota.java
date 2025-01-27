public class HundirLaFlota {
    public static void main(String[] args) {
        Tablero.crearPartida();

        do{

            Tablero.tiro(
                    InterfazUsuario.inputFila(),
            InterfazUsuario.inputColumna());
            System.out.println(Tablero.barcos.get(1));

        }while (!(Tablero.comprobarFinPartida()));
    }



}
