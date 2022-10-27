package guia8extra1;

public class SalaCine {

    //ATRIBUTOS
    private Espectador[][] sala;
    private Pelicula peli;
    private boolean[][] asientos;
    private int asientoLibre;
    private final int valorEntrada = 1200;

    //CONSTRUCTORES
    public SalaCine() {
        this.sala = new Espectador[6][8];
        this.asientoLibre = 48;
        this.asientos = new boolean[6][8];
    }

    //METODOS
    public boolean asientoDisponible() {
        //CONTADOR
        if (this.asientoLibre > 0) {
            System.out.println("SI HAY LUGAR DISPONIBLE");
            return true;
        } else {
            System.out.println("NO HAY LUGAR DISPONIBLE");
            return false;
        }
        //esto tiene que recorrer la matriz)?
        /*si esta ocupado se muestra una X, sino un espacio vacío.*/
    }

    public boolean costeEntrada(Espectador e) {
        //usa dinero de la persona creada y descuenta el saldo del usuario
        if (valorEntrada <= e.getDinero()) {
            System.out.println("Entrada pagada");
            return true;
        } else {
            System.out.println("pobre");
            return false;
        }
    }

    public boolean saberLegal(Espectador e) {
        //saber si la persona es +18
        if (e.getEdad() >= 18) {
            System.out.println("Es mayor");
            return true;
        } else {
            System.out.println("Es menor");
            return false;
        }
    }

    public void agregarPelicula(Pelicula a) {
        
        this.peli = a;
        
    }

    public void agregarEspectador(Espectador e) {
        this.asignarAsiento(e);
    }

//    public void abrirSala(){
//        ServicioPelicula newPeli = new ServicioPelicula();
//        newPeli.crearCartelera();
//        this.peli = 
//    }
    public void asignarAsiento(Espectador e) {
        //COMPRUEBA SI CUMPLE LOS REQUISITOS
        if (this.asientoDisponible() && this.costeEntrada(e) && this.saberLegal(e)) {
            //GENERA LUGARES ALETORIOS ENTRE FILAS Y COLUMNAS
            Double a = Math.random() * 6;
            Double b = Math.random() * 8;
            Integer fila = a.intValue();
            Integer columna = b.intValue();
            //
            if (this.asientos[fila][columna] == false) {
                this.asientoLibre--;
                e.setDinero(e.getDinero() - valorEntrada);
                this.asientos[fila][columna] = true;
                this.sala[fila][columna] = e;
            } else {
                System.out.println("ASIENTO OCUPADPO");
            }
        } else {
            System.out.println("NO CUMPLE LOS REQUISITOS");
        }
    }

    public void mostrarSala() {
        //muestra la matriz AL FINAL
        //FILAS
        //letras
        for (int i = 0; i < this.asientos.length; i++) {
            //COLUMA
            //numeros
            for (int j = 0; j < this.asientos[0].length; j++) {
                if (asientos[i][j] == true) {
                    System.out.print("X");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println("");
        }
    }
}
