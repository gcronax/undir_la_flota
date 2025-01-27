public class HundirLaFlota {
    public static void main(String[] args) {
        do{


            Tablero.tiro(
                    InterfazUsuario.inputFila(),
            InterfazUsuario.inputColumna());


        }while (!(Tablero.comprobarFinPartida()));
    }



}
