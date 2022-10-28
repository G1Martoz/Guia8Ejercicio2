package guia8extra1;

public class Pelicula {
    //ATRIBUTOS
    private String titulo;
    private Integer duracion;
    EnumPeggy edadMinima;
    private String director;
    
    //CONSTRUCTORES
    public Pelicula() {
    }
    public Pelicula(String titulo, Integer duracion,EnumPeggy edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    //GET&SET
    public EnumPeggy getEdadMinima() {
        return edadMinima;
    }
    public void setEdadMinima(EnumPeggy edadMinima) {    
        this.edadMinima = edadMinima;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Integer getDuracion() {
        return duracion;
    }
    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    
    //METODOS
    @Override
    public String toString() {
        return  titulo + " / duracion: " + duracion + " minutos. /edadMinima: " + edadMinima + " / director:" + director ;
    }
    
    
}
