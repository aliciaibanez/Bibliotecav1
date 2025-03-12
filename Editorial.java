public class Editorial {
 
    private String nombre;
    private String pais;
 
    public Editorial(){
        nombre = "Luis";
        pais = "España";
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getNombre() {
        return nombre;
    }
    public String getPais(){
        return pais;
    }
    public void setPais(String elPais){
        elPais = pais;
    }
 
    public void imprimirDetalles() {
        System.out.println ("Nombre: " + nombre + " " + "País: " + pais);
    }
 
}