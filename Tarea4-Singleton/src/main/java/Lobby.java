public class Lobby {

    private ConfiguracionGlobal config;

    public Lobby() {
        // Obtenemos la misma instancia de configuración
        this.config = ConfiguracionGlobal.getInstancia();
    }

    public void mostrarMenuConfiguraciones() {
        System.out.println("\n=== MENÚ DE CONFIGURACIONES (LOBBY) ===");
        config.mostrarConfiguraciones();
    }

    public void ajustarConfiguracionesMenu() {
        System.out.println("Ajustando configuraciones desde el lobby:");
        config.setIdioma("Inglés");
        config.setPantallaCopleta(false);
        config.setResolucionAncho(1280);
        config.setResolucionAlto(720);
        System.out.println("Configuraciones actualizadas desde el lobby:");
        config.mostrarConfiguraciones();
    }
}

