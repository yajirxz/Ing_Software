public class ConfiguracionGlobal {
        // Instancia única del Singleton
        private static ConfiguracionGlobal instancia;

        // Configuraciones del juego
        private int volumenMusica;
        private int volumenEfectos;
        private String dificultad;
        private int resolucionAncho;
        private int resolucionAlto;
        private boolean pantallaCopleta;
        private String idioma;

        // Constructor privado para evitar instanciación externa
        private ConfiguracionGlobal() {
            // Valores por defecto
            volumenMusica = 70;
            volumenEfectos = 80;
            dificultad = "Normal";
            resolucionAncho = 1920;
            resolucionAlto = 1080;
            pantallaCopleta = true;
            idioma = "Español";
        }

        // Método para obtener la instancia única
        public static synchronized ConfiguracionGlobal getInstancia() {
            if (instancia == null) {
                instancia = new ConfiguracionGlobal();
            }
            return instancia;
        }

        // Métodos getter y setter para las configuraciones
        public int getVolumenMusica() {
            return volumenMusica;
        }

        public void setVolumenMusica(int volumenMusica) {
            this.volumenMusica = volumenMusica;
        }

        public int getVolumenEfectos() {
            return volumenEfectos;
        }

        public void setVolumenEfectos(int volumenEfectos) {
            this.volumenEfectos = volumenEfectos;
        }

        public String getDificultad() {
            return dificultad;
        }

        public void setDificultad(String dificultad) {
            this.dificultad = dificultad;
        }

        public int getResolucionAncho() {
            return resolucionAncho;
        }

        public void setResolucionAncho(int resolucionAncho) {
            this.resolucionAncho = resolucionAncho;
        }

        public int getResolucionAlto() {
            return resolucionAlto;
        }

        public void setResolucionAlto(int resolucionAlto) {
            this.resolucionAlto = resolucionAlto;
        }

        public boolean isPantallaCopleta() {
            return pantallaCopleta;
        }

        public void setPantallaCopleta(boolean pantallaCopleta) {
            this.pantallaCopleta = pantallaCopleta;
        }

        public String getIdioma() {
            return idioma;
        }

        public void setIdioma(String idioma) {
            this.idioma = idioma;
        }

        // Método para mostrar todas las configuraciones actuales
        public void mostrarConfiguraciones() {
            System.out.println("=== CONFIGURACIONES ACTUALES ===");
            System.out.println("Volumen de música: " + volumenMusica + "%");
            System.out.println("Volumen de efectos: " + volumenEfectos + "%");
            System.out.println("Dificultad: " + dificultad);
            System.out.println("Resolución: " + resolucionAncho + "x" + resolucionAlto);
            System.out.println("Pantalla completa: " + (pantallaCopleta ? "Sí" : "No"));
            System.out.println("Idioma: " + idioma);
            System.out.println("==============================");
        }

        // Método para cargar configuraciones (simulado)
        public void cargarConfiguraciones() {
            System.out.println("Cargando configuraciones desde archivo...");
            // Aquí iría el código para cargar desde un archivo
        }

        // Método para guardar configuraciones (simulado)
        public void guardarConfiguraciones() {
            System.out.println("Guardando configuraciones en archivo...");
            // Aquí iría el código para guardar en un archivo
        }
    }


