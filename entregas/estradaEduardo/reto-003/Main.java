import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            System.out.println("===== Gestión de Biblioteca Digital =====");
            System.out.println("1. Agregar Documento");
            System.out.println("2. Buscar Documento por Título");
            System.out.println("3. Mostrar todos los Documentos");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarDocumento(scanner, biblioteca);
                    break;
                case 2:
                    buscarDocumento(scanner, biblioteca);
                    break;
                case 3:
                    mostrarDocumentos(biblioteca);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    private static void agregarDocumento(Scanner scanner, Biblioteca biblioteca) {
        System.out.print("Ingrese el título del documento: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese el número de autores: ");
        int numAutores = scanner.nextInt();
        scanner.nextLine();

        List<String> autores = new ArrayList<>();
        for (int i = 0; i < numAutores; i++) {
            System.out.print("Ingrese el nombre del autor " + (i + 1) + ": ");
            autores.add(scanner.nextLine());
        }

        System.out.print("Ingrese el año de publicación: ");
        int anioPublicacion = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el tipo de documento (Libro, Revista, Artículo, Paper): ");
        String tipoDocumento = scanner.nextLine();

        System.out.print("Ingrese las palabras clave (separadas por comas): ");
        String palabrasClaveInput = scanner.nextLine();
        List<String> palabrasClave = List.of(palabrasClaveInput.split(","));

        Documento documento = new Documento(titulo, autores, anioPublicacion, tipoDocumento, palabrasClave);
        biblioteca.agregarDocumento(documento);
        System.out.println("Documento agregado correctamente.\n");
    }

    private static void buscarDocumento(Scanner scanner, Biblioteca biblioteca) {
        System.out.print("Ingrese el título a buscar: ");
        String tituloBuscar = scanner.nextLine();
        List<Documento> resultados = biblioteca.buscarPorTitulo(tituloBuscar);
        if (resultados.isEmpty()) {
            System.out.println("No se encontraron documentos con ese título.");
        } else {
            System.out.println("Resultados de la búsqueda:");
            for (Documento documento : resultados) {
                System.out.println(documento);
                System.out.println("------------------------------------");
            }
        }
    }

    private static void mostrarDocumentos(Biblioteca biblioteca) {
        System.out.println("Listado de todos los documentos:");
        System.out.println(biblioteca);
    }
}
