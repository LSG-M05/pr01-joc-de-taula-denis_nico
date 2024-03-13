package juegocartas;
import java.util.Scanner;

public class JuegoCartas {

    static int numTurno;

    public static void main(String[] args){
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
            System.out.println("Quieres jugar otra partida?");
            respuesta = sc.nextInt();
        }

        System.out.println("Bye Bye");

        public static void iniciarRonda(int num)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Aquí están tus cartas");

            juegocartas.Carta.generarCartas();

            juegocartas.Carta.mostrarCartaso();

            juegocartas.Carta.generarCartasOponente();
            System.out.println();

            juegocartas.Carta.mostrarCartaso();
            System.out.println();

            juegocartas.Juego.definirTurno();
            System.out.println("Elige 3 cartas para usarlas: 1-9 / 10-Pasar");
            System.out.println();

            System.out.println("Tus cartas" + "              |               " + "Cartas oponente");

            while (numTurno < num)
            {
                Juego.juegoUsuario.cartaUsada = sc.nextInt();

                procesoElegirCartas(Juego.juegoUsuario.cartaUsada);

            }

            System.out.println();
            Juego.compararCartas(Juego.turnoAoD);
            Juego.resetearTotales();
            Carta.resetearActivas();
        }

        public static void procesoElegirCartas(int num)
        {
            switch (num) {
                case 1:
                    if (Carta.carta1.activa == true) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Ya has elegido esa carta. Prueba otra");

                        Juego.juegoUsuario.cartaUsada = scanner.nextInt();

                        procesoElegirCartas(Juego.juegoUsuario.cartaUsada);
                    } else {
                        Carta.carta1.mostrarCarta(1);

                        Juego.sumarCarta(1);

                        Carta.carta1.activa = true;

                        Juego.respuestaOponente();
                        numTurno++;
                    }
                    break;
                case 2:
                    if (Carta.carta2.activa == true) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Ya has elegido esa carta, prueba con otra");
                        Juego.juegoUsuario.cartaUsada = scanner.nextInt();
                        procesoElegirCartas(Juego.juegoUsuario.cartaUsada);
                    } else {
                        Carta.carta2.mostrarCarta(2);
                        Juego.sumarCarta(2);
                        Carta.carta2.activa = true;
                        Juego.respuestaOponente();
                        numTurno++;
                    }
                    break;
                case 3:
                    if (Carta.carta3.activa == true) {
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
                    if (Carta.carta4.activa == true) {
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
                    if (Carta.carta5.activa == true) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Ya has elegido esa carta, prueba con otra");
                        Juego.juegoUsuario.cartaUsada = sc.nextInt();
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
                    if (Carta.carta6.activa == true) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Ya has elegido esa carta, prueba con otra");
                        Juego.juegoUsuario.cartaUsada = sc.nextInt();
                        procesoElegirCartas(Juego.juegoUsuario.cartaUsada);
                    } else {
                        Carta.carta6.mostrarCarta(6);
                        Juego.sumarCarta(6);
                        Carta.carta6.activa = true;
                        Juego.respuestaOponente();
                        numTurno++;
                    }
                    break;
                case 7:
                    if (Carta.carta7.activa == true) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Ya has elegido esa carta, prueba con otra");
                        Juego.juegoUsuario.cartaUsada = sc.nextInt();
                        procesoElegirCartas(Juego.juegoUsuario.cartaUsada);
                    } else {
                        Carta.carta7.mostrarCarta(7);
                        Juego.sumarCarta(7);
                        Carta.carta7.activa = true;
                        Juego.respuestaOponente();
                        numTurno++;
                    }
                    break;
                case 8:
                    if (Carta.carta8.activa == true) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Ya has elegido esa carta, prueba con otra");
                        Juego.juegoUsuario.cartaUsada = sc.nextInt();
                        procesoElegirCartas(Juego.juegoUsuario.cartaUsada);
                    } else {
                        Carta.carta8.mostrarCarta(8);
                        Juego.sumarCarta(8);
                        Carta.carta8.activa = true;
                        Juego.respuestaOponente();
                        numTurno++;
                    }
                    break;
                case 9:
                    if (Carta.carta9.activa == true) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Ya has elegido esa carta, prueba con otra");
                        Juego.juegoUsuario.cartaUsada = sc.nextInt();
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

}