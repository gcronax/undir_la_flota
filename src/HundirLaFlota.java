public class HundirLaFlota {
    public static void main(String[] args) {
        Tablero.crearPartida();

        do{

            Tablero.tiro(
                    InterfazUsuario.inputFila(),
            InterfazUsuario.inputColumna());

        }while (!(Tablero.comprobarFinPartida()));
    }



}
