package juegocartas;
import java.util.Random;
//Esta clase se encarga de generar las cartas para un juego, además de mostrarlas y activarlas
public class carta {

    public int ataque; //Hace referencia al ataque de una carta
    public int defensa; //Hace referencia a la defensa de una carta
    public String tipo = "valor"; //Indica el tipo de una carta
    public boolean activa = false; // Indica si una carta esta activada o no
    //Generamos tipo, ataque y defensa de las cartas con este método
    public void generarCarta()
    {
        Random rnd = new Random();
//Generamos un valor de ataque aleatorio (1-100)
        ataque = (rnd.nextInt(100)+1);
//Generamos un valor de defensa aleatorio (1-100)
        defensa = (rnd.nextInt(100)+1);
//Dependiendo del valor de su ataque o defensa le agregamos un tipo
        if (ataque > 95 || defensa > 95)
        {
            tipo = "Rey";
        }
        else if (ataque > 80 || defensa > 80)
        {
            tipo = "Mago";
        }
        else if (ataque > 60 || defensa > 60)
        {
            tipo = "Caballero";
        }
        else if (ataque > 40 || defensa > 40)
        {
            tipo = "Arquero";
        }
        else if (ataque > 20 || defensa > 20)
        {
            tipo = "Artillero";
        }
        else
        {
            tipo ="Soldado";
        }
    }
    //Método para mostrar tipo, ataque y defensa de una carta
    public void mostrarCarta (int n)
    {
        System.out.print(n + "(" + tipo +  " A" + ataque + "D" + defensa + "), ");
    }
    //El método genera todas las cartas del usuario
    public static void generarCartas()
    {
        carta1.generarCarta();
        carta2.generarCarta();
        carta3.generarCarta();
        carta4.generarCarta();
        carta5.generarCarta();
        carta6.generarCarta();
        carta7.generarCarta();
        carta8.generarCarta();
        carta9.generarCarta();
    }
    //El método genera todas las cartas del oponente
    public static void generarCartasOponente()
    {
        carta01.generarCarta();
        carta02.generarCarta();
        carta03.generarCarta();
        carta04.generarCarta();
        carta05.generarCarta();
        carta06.generarCarta();
        carta07.generarCarta();
        carta08.generarCarta();
        carta09.generarCarta();
    }

    public static void mostrarCartas() {
        carta1.mostrarCarta (1);
        carta2.mostrarCarta(2);
        carta3.mostrarCarta(3);
        carta4.mostrarCarta (4);
        carta5.mostrarCarta (5);
        carta6.mostrarCarta (6);
        carta7.mostrarCarta (7);
        carta8.mostrarCarta (8);
        carta9.mostrarCarta (9);
    }
    //Método para mostrar todas las cartas del oponente
    public static void mostrarCartas0()
    {
        carta01.mostrarCarta (1);
        carta02.mostrarCarta(2);
        carta03.mostrarCarta(3);
        carta04.mostrarCarta (4);
        carta05.mostrarCarta (5);
        carta06.mostrarCarta (6);
        carta07.mostrarCarta (7);
        carta08.mostrarCarta (8);
        carta09.mostrarCarta (9);
    }
    //Método para resetear las cartas activas al final de una ronda
    public static void resetearActivas()
    {
//Cartas usuario
        carta1.activa = false;
        carta2.activa = false;
        carta3.activa = false;
        carta4.activa = false;
        carta5.activa = false;
        carta6.activa = false;
        carta7.activa = false;
        carta8.activa = false;
        carta9.activa = false;
//Cartas oponente
        carta01.activa = false;
        carta02.activa = false;
        carta03.activa = false;
        carta04.activa = false;
        carta05.activa = false;
        carta06.activa = false;
        carta07.activa = false;
        carta08.activa = false;
        carta09.activa = false;
    }

    //Instanciamos todas las cartas del usuario
    public static Carta carta1 = new Carta();
    public static Carta carta2 = new Carta();
    public static Carta carta3 = new Carta();
    public static Carta carta4 = new Carta();
    public static Carta carta5 = new Carta();
    public static Carta carta6 = new Carta();
    public static Carta carta7 = new Carta();
    public static Carta carta8 = new Carta();
    public static Carta carta9 = new Carta();
    //Instanciamos todas las cartas del oponente
    public static Carta carta01 = new Carta();
    public static Carta carta02 = new Carta();
    public static Carta carta03 = new Carta();
    public static Carta carta04 = new Carta();
    public static Carta carta05 = new Carta();
    public static Carta carta06 = new Carta();
    public static Carta carta07 = new Carta();
    public static Carta carta08 = new Carta();
    public static Carta carta09 = new Carta();
}
