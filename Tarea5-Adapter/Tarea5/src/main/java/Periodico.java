public class Periodico extends Producto{
    private String id;
    private String nombre;
    private String fechaPublicacion;

    public Periodico(String id, String nombre, String fechaPublicacion, double precio) {
        super(precio);
        this.id = id;
        this.nombre = nombre;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String obtenerInformacion() {
        return "Periódico - ID: " + id + ", Nombre: " + nombre +
                ", Fecha de publicación: " + fechaPublicacion + ", Precio: $" + getPrecio();
    }
}

