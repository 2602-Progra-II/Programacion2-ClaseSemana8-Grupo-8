import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    
    List <Libro> libros = new ArrayList<Libro>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        for (Libro libroVariable : libros) {
            System.out.println(libroVariable.toString());
        }
    }

    public Libro buscarPorTitulo(String titulo) {
        for (Libro libroVariable : libros) {
            if (libroVariable.getTitulo().equals(titulo)) {
                return libroVariable;
            }
        }
        return null;
    }

    public boolean prestarLibro(String titulo) {
        for (Libro libroVariable : libros) {
            if (libroVariable.getTitulo().equals(titulo)) {
                libroVariable.setDisponible(false);
                        return true;
            }
        }
        return false;
    }
}