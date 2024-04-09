import java.util.List;

class Documento {
    private String titulo;
    private List<String> autores;
    private int anioPublicacion;
    private String tipoDocumento;
    private List<String> palabrasClave;

    public Documento(String titulo, List<String> autores, int anioPublicacion, String tipoDocumento, List<String> palabrasClave) {
        this.titulo = titulo;
        this.autores = autores;
        this.anioPublicacion = anioPublicacion;
        this.tipoDocumento = tipoDocumento;
        this.palabrasClave = palabrasClave;
    }

    public String getTitulo() {
        return titulo;
    }

    // Otros getters y setters

    @Override
    public String toString() {
        return "Titulo: " + titulo +
                "\nAutores: " + autores +
                "\nAño de Publicación: " + anioPublicacion +
                "\nTipo de Documento: " + tipoDocumento +
                "\nPalabras Clave: " + palabrasClave;
    }
}
