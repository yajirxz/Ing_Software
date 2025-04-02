public class Main {
        public static void main(String[] args) {
            // Crear instancia de juego
            Juego miJuego = new Juego("DOOM ETERNAL");
            miJuego.iniciar();

            // Modificar configuraciones desde el juego
            miJuego.cambiarConfiguraciones();

            // Crear instancia de lobby
            Lobby lobby = new Lobby();
            lobby.mostrarMenuConfiguraciones();

            // Modificar configuraciones desde el lobby
            lobby.ajustarConfiguracionesMenu();

            // Verificar que los cambios afectan a ambas clases (mismo objeto)
            System.out.println("\n=== VERIFICANDO CONFIGURACIÓN GLOBAL ===");
            miJuego.iniciar();

            // Finalizar juego
            miJuego.finalizarJuego();
        }
}

