package es.is.puerto;
import java.util.ArrayList;
import java.util.List;
public class Miembro {
    public String id;
    public List<Prestamo> historialPrestamos;
    public Nombre nombre;
public boolean registrarMiembro(String id, Nombre nombre){
    return true;
}
public List<Prestamo> verHistorial(String id){
    return new ArrayList<>();
}
public boolean reservarSala(String id){
    return true;
}
}
