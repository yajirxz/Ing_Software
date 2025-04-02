public class Juego {
    private String nombreJuego;
    private ConfiguracionGlobal config;

    public Juego(String nombre) {
        this.nombreJuego = nombre;
        // Obtenemos la instancia única de configuración
        this.config = ConfiguracionGlobal.getInstancia();
    }

    public void iniciar() {
        System.out.println("Iniciando el juego: " + nombreJuego);
        System.out.println("Aplicando configuraciones:");
        config.mostrarConfiguraciones();
    }

    public void cambiarConfiguraciones() {
        System.out.println("Cambiando configuraciones desde el juego principal:");
        config.setDificultad("Difícil");
        config.setVolumenMusica(50);
        System.out.println("Configuraciones actualizadas:");
        config.mostrarConfiguraciones();
    }

    public void finalizarJuego() {
        System.out.println("Guardando configuraciones y cerrando el juego...");
        config.guardarConfiguraciones();
        System.out.println("Juego finalizado");
    }
}

