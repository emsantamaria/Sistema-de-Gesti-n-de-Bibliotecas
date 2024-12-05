package es.is.puerto;

public class Libro {
    public String titulo;
    public String autor;
    public String isbn;
    public String categoria;
public boolean verificarDisponibilidad(){
    return true;
}
public Categoria asignarCategoria(){
    return new Categoria();
}
}
