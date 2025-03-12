public class Autor {
 
    private String nacionalidad;
    private String nombre;
    private Editorial editorial;
    public Autor(){
        nacionalidad = "España";
        nombre = "Miguel De Cervantes";
        editorial = new Editorial();
    }
 
}