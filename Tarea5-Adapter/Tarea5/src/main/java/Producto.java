abstract class Producto {
    private double precio;

    public Producto(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodo abstracto que cada producto debe aplicar
    public abstract String obtenerInformacion();
}

