package juegocartas;
import java.util.Random;

// Esta clase se encarga de administrar los juegos de los participantes y sumar los puntos de cada juego
public class Juego {

    public int cartaUsada; // Aquí guardamos las cartas elegidas por los jugadores
    public int sumaAtaque; // Aquí guardamos el total de ataque en una ronda de los jugadores
    public int sumaDefensa; // Aquí guardamos el total de defensa en una ronda de los jugadores
    public int rondasGanadas; // Aquí guardamos el total de rondas ganadas de cada juego

    static int turnoAoD;

    // El método agrega el ataque y defensa de una carta utilizada a los totales del jugador
    public static void sumarCarta(int num) {
        switch (num) {
            case 1 -> {
                juegoUsuario.sumaAtaque += Carta.carta1.ataque;
                juegoUsuario.sumaDefensa += Carta.carta1.defensa;
            }
            case 2 -> {
                juegoUsuario.sumaAtaque += Carta.carta2.ataque;
                juegoUsuario.sumaDefensa += Carta.carta2.defensa;
            }
            case 3 -> {
                juegoUsuario.sumaAtaque += Carta.carta3.ataque;
                juegoUsuario.sumaDefensa += Carta.carta3.defensa;
            }
            case 4 -> {
                juegoUsuario.sumaAtaque += Carta.carta4.ataque;
                juegoUsuario.sumaDefensa += Carta.carta4.defensa;
            }
            case 5 -> {
                juegoUsuario.sumaAtaque += Carta.carta5.ataque;
                juegoUsuario.sumaDefensa += Carta.carta5.defensa;
            }
            case 6 -> {
                juegoUsuario.sumaAtaque += Carta.carta6.ataque;
                juegoUsuario.sumaDefensa += Carta.carta6.defensa;
            }
            case 7 -> {
                juegoUsuario.sumaAtaque += Carta.carta7.ataque;
                juegoUsuario.sumaDefensa += Carta.carta7.defensa;
            }
            case 8 -> {
                juegoUsuario.sumaAtaque += Carta.carta8.ataque;
                juegoUsuario.sumaDefensa += Carta.carta8.defensa;
            }
            case 9 -> {
                juegoUsuario.sumaAtaque += Carta.carta9.ataque;
                juegoUsuario.sumaDefensa += Carta.carta9.defensa;
            }
            default -> {
            }
        }
    }

    // El oponente elige una carta de forma aleatoria, se muestra y se suman sus valores a los valores totales del oponente
    public static void respuestaOponente() {
        Random rnd = new Random();
        juegoOponente.cartaUsada = (rnd.nextInt(9) + 1);
        verificarCartaOponente(juegoOponente.cartaUsada);
        sumarCartaOponente(juegoOponente.cartaUsada);
    }

    public static void verificarCartaOponente(int num) {
        switch (num) {
            case 1:
                if (juegocartas.Carta.carta01.activa == true) {
                    respuestaOponente();
                } else {
                    juegocartas.Carta.carta01.activa = true;
                    System.out.print(" ");
                    juegocartas.Carta.carta01.mostrarCarta(1);
                }
                break;
            case 2:
                if (juegocartas.Carta.carta02.activa == true) {
                    respuestaOponente();
                } else {
                    juegocartas.Carta.carta02.activa = true;
                    System.out.print(" ");
                    juegocartas.Carta.carta02.mostrarCarta(2);
                }
                break;
            case 3:
                if (juegocartas.Carta.carta03.activa == true) {
                    respuestaOponente();
                } else {
                    juegocartas.Carta.carta03.activa = true;
                    System.out.print(" ");
                    juegocartas.Carta.carta03.mostrarCarta(3);
                }
                break;
            case 4:
                if (juegocartas.Carta.carta04.activa == true) {
                    respuestaOponente();
                } else {
                    juegocartas.Carta.carta04.activa = true;
                    System.out.print(" ");
                    juegocartas.Carta.carta04.mostrarCarta(4);
                }
                break;
            case 5:
                if (juegocartas.Carta.carta05.activa == true) {
                    respuestaOponente();
                } else {
                    juegocartas.Carta.carta05.activa = true;
                    System.out.print(" ");
                    juegocartas.Carta.carta05.mostrarCarta(5);
                }
                break;
            case 6:
                if (juegocartas.Carta.carta06.activa == true) {
                    respuestaOponente();
                } else {
                    juegocartas.Carta.carta06.activa = true;
                    System.out.print(" ");
                    juegocartas.Carta.carta06.mostrarCarta(6);
                }
                break;

            case 7:
                if (juegocartas.Carta.carta07.activa == true) {
                    respuestaOponente();
                } else {
                    juegocartas.Carta.carta07.activa = true;
                    System.out.print(" ");
                    juegocartas.Carta.carta07.mostrarCarta(7);
                }
                break;
            case 8:
                if (juegocartas.Carta.carta08.activa == true) {
                    respuestaOponente();
                } else {
                    juegocartas.Carta.carta08.activa = true;
                    System.out.print(" ");
                    juegocartas.Carta.carta08.mostrarCarta(8);
                }
                break;
            case 9:
                if (juegocartas.Carta.carta09.activa == true) {
                    respuestaOponente();
                } else {
                    juegocartas.Carta.carta09.activa = true;
                    System.out.print(" ");
                    juegocartas.Carta.carta09.mostrarCarta(9);
                }
                break;
            default:
                break;
        }
    }

    // El método agrega el ataque y defensa de una carta utilizada a los totales
    public static void sumarCartaOponente(int numo) {
        switch (numo) {
            case 1 -> {
                juegoUsuario.sumaAtaque += Carta.carta01.ataque;
                juegoUsuario.sumaDefensa += Carta.carta01.defensa;
            }
            case 2 -> {
                juegoUsuario.sumaAtaque += Carta.carta02.ataque;
                juegoUsuario.sumaDefensa += Carta.carta02.defensa;
            }
            case 3 -> {
                juegoUsuario.sumaAtaque += Carta.carta03.ataque;
                juegoUsuario.sumaDefensa += Carta.carta03.defensa;
            }
            case 4 -> {
                juegoUsuario.sumaAtaque += Carta.carta04.ataque;
                juegoUsuario.sumaDefensa += Carta.carta04.defensa;
            }
            case 5 -> {
                juegoUsuario.sumaAtaque += Carta.carta05.ataque;
                juegoUsuario.sumaDefensa += Carta.carta05.defensa;
            }
            case 6 -> {
                juegoUsuario.sumaAtaque += Carta.carta06.ataque;
                juegoUsuario.sumaDefensa += Carta.carta06.defensa;
            }
            case 7 -> {
                juegoUsuario.sumaAtaque += Carta.carta07.ataque;
                juegoUsuario.sumaDefensa += Carta.carta07.defensa;
            }
            case 8 -> {
                juegoUsuario.sumaAtaque += Carta.carta08.ataque;
                juegoUsuario.sumaDefensa += Carta.carta08.defensa;
            }
            case 9 -> {
                juegoUsuario.sumaAtaque += Carta.carta09.ataque;
                juegoUsuario.sumaDefensa += Carta.carta09.defensa;
            }
            default -> {
            }
        }
    }


    // El método define de forma aleatoria quién atacará y quién defenderá durante la ronda
    public static void definirTurno() {
        Random rnd = new Random();
        turnoAoD = (rnd.nextInt(2));
        // Si el número aleatorio = 0, el jugador ataca, de lo contrario, defiende
        if (turnoAoD == 0) {
            System.out.println("Te toca atacar");
        } else {
            System.out.println("Te toca defender");
        }
    }

    // El método define quién es el ganador de la ronda
    public static void compararCartas(int turnoAoD) {
        // Si el jugador ataca, calculamos el ganador
        if (turnoAoD == 0) {
            // Mostramos los valores totales del jugador y oponente
            System.out.println("Ataque total: " + juegoUsuario.sumaAtaque);
            System.out.println("Defensa total oponente: " + juegoOponente.sumaDefensa);
            // Se comparan totales y se determina el ganador de la ronda
            // si gana se le agrega +1 ronda ganada
            if (juegoUsuario.sumaAtaque > juegoOponente.sumaDefensa) {
                System.out.println("Has ganado la ronda!");
                juegoUsuario.rondasGanadas++;
            } else if (juegoUsuario.sumaAtaque == juegoOponente.sumaDefensa) {
                System.out.println("La ronda está empatada!");
            } else if (juegoUsuario.sumaAtaque < juegoOponente.sumaDefensa) {
                System.out.println("Has perdido la ronda!");
                juegoOponente.rondasGanadas++;
            }
        }
        // Si el jugador defiende, calculamos el ganador
        else {
            // Mostramos los valores totales del jugador y oponente
            System.out.println("Defensa total: " + juegoUsuario.sumaDefensa);
            System.out.println("Ataque total oponente: " + juegoOponente.sumaAtaque);
            if (juegoUsuario.sumaDefensa > juegoOponente.sumaAtaque) {
                System.out.println("Has ganado la ronda!");
                juegoUsuario.rondasGanadas++;
            } else if (juegoUsuario.sumaDefensa == juegoOponente.sumaAtaque) {
                System.out.println("La ronda está empatada!");
            } else if (juegoUsuario.sumaDefensa < juegoOponente.sumaAtaque) {
                System.out.println("Has perdido la ronda!");
                juegoOponente.rondasGanadas++;
            }
        }
    }

    // Método que resetea las sumas totales de ataque y defensa del jugador y oponente
    public static void resetearTotales() {
        juegoUsuario.sumaAtaque = 0;
        juegoUsuario.sumaDefensa = 0;
        juegoOponente.sumaAtaque = 0;
        juegoOponente.sumaDefensa = 0;
    }

    // Método que determina el ganador con base en las rondas ganadas
    public static void verificarGanador() {
        if (juegoUsuario.rondasGanadas > juegoOponente.rondasGanadas)
            System.out.println("HAS GANADO EL JUEGO!");
        else if (juegoUsuario.rondasGanadas == juegoOponente.rondasGanadas)
            System.out.println("EL JUEGO HA QUEDADO EMPATADO");
        else
            System.out.println("HAS PERDIDO EL JUEGO! :(");
    }

    // Resetea todos los valores del juego al final de una partida
    public static void resetearValoresJuego() {
        resetearTotales();
        juegoOponente.rondasGanadas = 0;
        juegoUsuario.rondasGanadas = 0;
    }

    // Instanciamos los juegos del usuario y del oponente
    public static Juego juegoUsuario = new Juego();
    public static Juego juegoOponente = new Juego();
}