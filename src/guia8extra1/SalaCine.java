package guia8extra1;

import java.util.Scanner;

public class SalaCine {

    //ATRIBUTOS
    // el atributo sala no se utiliza, solo se le asignan los espectadores al lugar.
    //borrar atributo y la asignacion del espectador a la sala y dejar solo el de asientos
    private Espectador[][] sala;
    private Pelicula peli;
    private Boolean[][] asientos;
    private int asientoLibre;
    private final int valorEntrada = 1200;

    //CONSTRUCTORES
    public SalaCine() {
        this.asientos = new Boolean[8][6];
        this.sala = new Espectador[8][6];
        this.asientoLibre = 48;
        this.incializarMatriz();
    }

    //METODOS
    public void incializarMatriz() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                this.asientos[i][j] = false;
            }
        }
    }

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
        System.out.println("");
        System.out.println("--------------------------");
        if (this.asientoDisponible() && this.costeEntrada(e) && this.saberLegal(e)) {
            //GENERA LUGARES ALETORIOS ENTRE FILAS Y COLUMNAS
            Double a = Math.random() * 8;
            Double b = Math.random() * 6;
            Integer fila = a.intValue();
            Integer columna = b.intValue();
            //Asigna el espectador al asiento.
            if (this.asientos[fila][columna] == false) {
                this.asientoLibre--; //resta variable de la sala
                e.setDinero(e.getDinero() - valorEntrada); // actualiza el dinero del cliente
                this.asientos[fila][columna] = true;    // pone el asiento en ocupado.
                this.sala[fila][columna] = e;   // asigna Espectador
            } else {
                System.out.println("ASIENTO OCUPADPO");
            }
        } else {
            System.out.println("NO CUMPLE LOS REQUISITOS");
        }
    }

    public void mostrarLetra(String letra, int numFila, int numColumna) {
        if (asientos[numFila][numColumna] == true) {
            System.out.print((numFila + 1) + letra + " X ");
        } else {
            System.out.print((numFila + 1) + letra + " - ");
        }
    }

    public void mostrarFila(int numFila) {

        for (int j = 0; j < asientos[0].length; j++) {
            // recorre las columnas
            switch (j) {
                case 0:
                    this.mostrarLetra("A", numFila, j);
                    break;
                case 1:
                    this.mostrarLetra("B", numFila, j);
                    break;
                case 2:
                    this.mostrarLetra("C", numFila, j);
                    break;
                case 3:
                    this.mostrarLetra("D", numFila, j);
                    break;
                case 4:
                    this.mostrarLetra("E", numFila, j);
                    break;
                case 5:
                    this.mostrarLetra("F", numFila, j);
                    break;
            }

        }

    }

    // Este metodo Crea los dos Servicios (Pelicula y Espectador)
    //
    public void llenarSala() {
        Scanner leer = new Scanner (System.in);
        //SERVICIO PELICULA
        ServicioPelicula newPeli = new ServicioPelicula();
       
        //SERVICIO ESPECTADOR
        ServicioEspectador visor1 = new ServicioEspectador();
        
        // Crea pelicula y la ingresa en la sala.
        newPeli.crearCartelera();
        this.agregarPelicula(newPeli.getCartelera().get(0));
        
        char op;
        int ultimoAgregado;
        do {
            System.out.println("Ingresar Espectador: ");
            
            // Crear espectador agrega a la lista interna del servicio al espectador.
            visor1.crearEspectador();
            
            //Setea al ultimo en la lista.
            ultimoAgregado=visor1.getListaDeEspectadores().size()-1;
            // Saca de la lista espectadores y lo ingresa a la sala.
            this.agregarEspectador(visor1.getListaDeEspectadores().get(ultimoAgregado));
            
            System.out.println("Desea ingresar otro espectador? s/n");
            op= leer.next().toLowerCase().charAt(0);
        } while (!(op == 'n'));
        
        this.mostrarSala();

    }

    public void mostrarSala() {
        //muestra la matriz AL FINAL
        //System.out.println("ASIENTOS.LENGTH: " + this.asientos.length);
        //System.out.println("ASIENTOS.LENGTH [0]: " + this.asientos[0].length);
        System.out.println("La pelicula actual es: " + this.peli.toString());

        for (int i = 0; i < this.asientos.length; i++) {
            //recorre la cantidad de filas a mostrar
            this.mostrarFila(i);
            System.out.println("");
        }
    }
}
