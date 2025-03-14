
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro
{
    String titulo;
    String genero;
    Autor autor;
    
    
    public Libro () {
        titulo = "Don Quijote de la Macha";
        genero = "Caballeresco";
        Autor autor = new Autor();
    }
}
