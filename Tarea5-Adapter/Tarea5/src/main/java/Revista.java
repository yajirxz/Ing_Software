public class Revista extends Producto{
        private String issn;
        private String nombre;
        private int numeroEdicion;
        private String periodicidad;

        public Revista(String issn, String nombre, int numeroEdicion, String periodicidad, double precio) {
            super(precio);
            this.issn = issn;
            this.nombre = nombre;
            this.numeroEdicion = numeroEdicion;
            this.periodicidad = periodicidad;
        }

        public String getIssn() {
            return issn;
        }

        public String getNombre() {
            return nombre;
        }

        public int getNumeroEdicion() {
            return numeroEdicion;
        }

        public String getPeriodicidad() {
            return periodicidad;
        }

        @Override
        public String obtenerInformacion() {
            return "Revista - ISSN: " + issn + ", Nombre: " + nombre + ", Edición: " + numeroEdicion +
                    ", Periodicidad: " + periodicidad + ", Precio: $" + getPrecio();
        }
}
