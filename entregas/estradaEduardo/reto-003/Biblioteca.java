import java.util.List;
import java.util.ArrayList;


class Biblioteca {
    private List<Documento> documentos;

    public Biblioteca() {
        this.documentos = new ArrayList<>();
    }

    public void agregarDocumento(Documento documento) {
        this.documentos.add(documento);
    }

    public List<Documento> buscarPorTitulo(String titulo) {
        List<Documento> resultados = new ArrayList<>();
        for (Documento documento : documentos) {
            if (documento.getTitulo().contains(titulo)) {
                resultados.add(documento);
            }
        }
        return resultados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Documento documento : documentos) {
            sb.append(documento).append("\n\n");
        }
        return sb.toString();
    }
}
