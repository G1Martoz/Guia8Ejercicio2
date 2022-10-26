package guia8extra1;

public class Espectador {
    //ATRIBUTOS
    private String nombre;
    private Integer edad;
    private Integer dinero;
    
    //CONSTRUCTORES
    public Espectador() {
    }

    public Espectador(String nombre, Integer edad, Integer dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }
    
    //GET&SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDinero() {
        return dinero;
    }

    public void setDinero(Integer dinero) {
        this.dinero = dinero;
    }
    
    //METODOS
//    @Override
//    public String toString() {
//        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + '}';
//    }
    
}
