public class Main {
    public static void main(String[] args) {
        // Crear un libro utilizando
        Libro libro = ProductoFactory.crearLibro("978-3-16-148410-0", "El Principito",
                "Muy buen libro", "Antoine de Saint-Exupéry",
                96, 89);

        // Crear una revista
        Revista revista = ProductoFactory.crearRevista("2049-3630", "National Geographic",
                256, "Mensual", 20);

        // Crear un periódico
        Periodico periodico = ProductoFactory.crearPeriodico("MTO-20230515", "El metro",
                "15/01/2025", 2.50);

        // Mostrar información de los productos
        System.out.println(libro.obtenerInformacion());
        System.out.println(revista.obtenerInformacion());
        System.out.println(periodico.obtenerInformacion());
    }
}

