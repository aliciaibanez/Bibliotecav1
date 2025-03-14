public class Autor {
 
    private String nacionalidad;
    private String nombre;
    private Editorial editorial;
    public Autor(){
        nacionalidad = "España";
        nombre = "Miguel De Cervantes";
        editorial = new Editorial();
    }
 
    public void setNacionalidad(String laNacionalidad) {
        laNacionalidad = nacionalidad;
    }
 
    public String getNacionalidad() {
        return nacionalidad;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String elNombre){
        elNombre = nombre;
    }
 
    public void imprimirDetalles() {
        System.out.println ("Nombre: " + nombre + " " + "Nacionalidad: " + nacionalidad);
        editorial.imprimirDetalles();
    }
    
    public Editorial getEditorial(){
        return editorial;
    }
    
    public void setEditorial(Editorial laEditorial){
        laEditorial = editorial;
    }
}