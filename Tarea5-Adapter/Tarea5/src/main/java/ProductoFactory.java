public class ProductoFactory {
    //Metodo para crear libros
    public static Libro crearLibro(String isbn, String titulo, String resena, String autor, int numeroPaginas, double precio) {
        return new Libro(isbn, titulo, resena, autor, numeroPaginas, precio);
    }

    //Metodo para crear revistas
    public static Revista crearRevista(String issn, String nombre, int numeroEdicion, String periodicidad, double precio) {
        return new Revista(issn, nombre, numeroEdicion, periodicidad, precio);
    }

    //Metodo para crear periodicos
    public static Periodico crearPeriodico(String id, String nombre, String fechaPublicacion, double precio) {
        return new Periodico(id, nombre, fechaPublicacion, precio);
    }
}

