package juegocartas;
import java.util.Scanner;

public class JuegoCartas {

    static int numTurno;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Juego de Cartas");
        System.out.println("Quieres jugar? 1 - Si / 2 - No");
        int respuesta = sc.nextInt();

        while (respuesta == 1) {
            System.out.println("Primera ronda: ");
            iniciarRonda(3);
            System.out.println("Presiona 1 para iniciar la siguiente ronda: ");
            sc.nextInt();

            System.out.println("Segunda ronda: ");
            iniciarRonda(6);
            System.out.println("Presiona 1 para iniciar la siguiente ronda: ");
            sc.nextInt();

            System.out.println("Tercera ronda: ");
            iniciarRonda(9);

            juegocartas.Juego.verificarGanador();

            numTurno = 0;
            juegocartas.Juego.resetearValoresJuego();
            System.out.println();
            System.out.println("Quieres jugar otra partida? 1 - Si / 2 - No");
            respuesta = sc.nextInt();
        }

        System.out.println("Bye Bye");

    }

    public static void iniciarRonda(int num)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aquí están tus cartas");
  
        // para que solo juege con las cartas generadas en la ronda 1
        if (numTurno == 0) {
                juegocartas.Carta.generarCartas();
            }
   

        juegocartas.Carta.mostrarCartas();

        juegocartas.Carta.mostrarCartas0();

        juegocartas.Carta.generarCartasOponente();
        System.out.println();

        juegocartas.Carta.mostrarCartas0();
        System.out.println();

        juegocartas.Juego.definirTurno();
        System.out.println("Elige 3 cartas para usarlas: 1-9 / Otro Número-Pasar");
        System.out.println();

        System.out.println("Tus cartas" + "           |            " + "Cartas oponente") ;

        while (numTurno < num)
        {
            juegocartas.Juego.juegoUsuario.cartaUsada = scanner.nextInt();

            procesoElegirCartas(juegocartas.Juego.juegoUsuario.cartaUsada);

        }

        System.out.println();
        juegocartas.Juego.compararCartas(juegocartas.Juego.turnoAoD);
        juegocartas.Juego.resetearTotales();
        juegocartas.Carta.resetearActivas();
    }

    public static void procesoElegirCartas(int num)
    {
        switch (num) {
            case 1:
                if (Carta.carta1.activa) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Ya has elegido esa carta. Prueba otra");

                    juegocartas.Juego.juegoUsuario.cartaUsada = scanner.nextInt();

                    procesoElegirCartas(juegocartas.Juego.juegoUsuario.cartaUsada);
                } else {
                    juegocartas.Carta.carta1.mostrarCarta(1);

                    juegocartas.Juego.sumarCarta(1);

                    juegocartas.Carta.carta1.activa = true;

                    juegocartas.Juego.respuestaOponente();
                    numTurno++;
                }
                break;
            case 2:
                if (Carta.carta2.activa) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Ya has elegido esa carta, prueba con otra");
                    juegocartas.Juego.juegoUsuario.cartaUsada = scanner.nextInt();
                    procesoElegirCartas(juegocartas.Juego.juegoUsuario.cartaUsada);
                } else {
                    Carta.carta2.mostrarCarta(2);
                    Juego.sumarCarta(2);
                    Carta.carta2.activa = true;
                    Juego.respuestaOponente();
                    numTurno++;
                }
                break;
            case 3:
                if (Carta.carta3.activa) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Ya has elegido esa carta, prueba con otra");
                    Juego.juegoUsuario.cartaUsada = scanner.nextInt();
                    procesoElegirCartas(Juego.juegoUsuario.cartaUsada);
                } else {
                    Carta.carta3.mostrarCarta(3);
                    Juego.sumarCarta(3);
                    Carta.carta3.activa = true;
                    Juego.respuestaOponente();
                    numTurno++;
                }
                break;
            case 4:
                if (Carta.carta4.activa) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Ya has elegido esa carta, prueba con otra");
                    Juego.juegoUsuario.cartaUsada = scanner.nextInt();
                    procesoElegirCartas(Juego.juegoUsuario.cartaUsada);
                } else {
                    Carta.carta4.mostrarCarta(4);
                    Juego.sumarCarta(4);
                    Carta.carta4.activa = true;
                    Juego.respuestaOponente();
                    numTurno++;
                }
                break;
            case 5:
                if (Carta.carta5.activa) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Ya has elegido esa carta, prueba con otra");
                    Juego.juegoUsuario.cartaUsada = scanner.nextInt();
                    procesoElegirCartas(Juego.juegoUsuario.cartaUsada);
                } else {
                    Carta.carta5.mostrarCarta(5);
                    Juego.sumarCarta(5);
                    Carta.carta5.activa = true;
                    Juego.respuestaOponente();
                    numTurno++;
                }
                break;
            case 6:
                if (Carta.carta6.activa) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Ya has elegido esa carta, prueba con otra");
                    Juego.juegoUsuario.cartaUsada = scanner.nextInt();
                    procesoElegirCartas(Juego.juegoUsuario.cartaUsada);
                } else {
                    juegocartas.Carta.carta6.mostrarCarta(6);
                    Juego.sumarCarta(6);
                    juegocartas.Carta.carta6.activa = true;
                    Juego.respuestaOponente();
                    numTurno++;
                }
                break;
            case 7:
                if (Carta.carta7.activa) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Ya has elegido esa carta, prueba con otra");
                    juegocartas.Juego.juegoUsuario.cartaUsada = scanner.nextInt();
                    procesoElegirCartas(juegocartas.Juego.juegoUsuario.cartaUsada);
                } else {
                    juegocartas.Carta.carta7.mostrarCarta(7);
                    juegocartas.Juego.sumarCarta(7);
                    juegocartas.Carta.carta7.activa = true;
                    juegocartas.Juego.respuestaOponente();
                    numTurno++;
                }
                break;
            case 8:
                if (Carta.carta8.activa) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Ya has elegido esa carta, prueba con otra");
                    Juego.juegoUsuario.cartaUsada = scanner.nextInt();
                    procesoElegirCartas(juegocartas.Juego.juegoUsuario.cartaUsada);
                } else {
                    juegocartas.Carta.carta8.mostrarCarta(8);
                    Juego.sumarCarta(8);
                    juegocartas. Carta.carta8.activa = true;
                    Juego.respuestaOponente();
                    numTurno++;
                }
                break;
            case 9:
                if (Carta.carta9.activa) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Ya has elegido esa carta, prueba con otra");
                    Juego.juegoUsuario.cartaUsada = scanner.nextInt();
                    procesoElegirCartas(Juego.juegoUsuario.cartaUsada);
                } else {
                    Carta.carta9.mostrarCarta(9);
                    Juego.sumarCarta(9);
                    Carta.carta9.activa = true;
                    Juego.respuestaOponente();
                    numTurno++;
                }
                break;
            default:
                System.out.println("Has elegido pasar   ");
                Juego.respuestaOponente();
                numTurno++;
                break;
        }


    }


}
