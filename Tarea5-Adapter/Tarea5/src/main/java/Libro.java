public class Libro extends Producto{
    private String isbn;
    private String titulo;
    private String resena;
    private String autor;
    private int numeroPaginas;

    public Libro(String isbn, String titulo, String resena, String autor, int numeroPaginas, double precio) {
        super(precio);
        this.isbn = isbn;
        this.titulo = titulo;
        this.resena = resena;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getResena() {
        return resena;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String obtenerInformacion() {
        return "Libro - ISBN: " + isbn + ", Título: " + titulo + ", Autor: " + autor +
                ", Páginas: " + numeroPaginas + ", Precio: $" + getPrecio();
    }
}

