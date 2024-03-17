package juegocartas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VehiNico_PodoveiDenis {

    static int numTurno; // Contador de turnos

    public static void main(String[] args) {
        iniciarJuego(); // Función principal que inicia el juego
    }

    // Función para iniciar el juego
    public static void iniciarJuego() {
        Scanner sc = new Scanner(System.in); // Crear objeto Scanner para entrada de usuario
        System.out.println("Juego de Cartas");
        System.out.println("¿Quieres jugar? 1 - Si / 2 - No");

        int respuesta = obtenerOpcion(sc, 1, 2); // Obtener la opción del usuario (1 o 2)
        if (respuesta == 1) {
            jugarPartida(sc); // Si elige jugar, iniciar la partida
        } else {
            System.out.println("Bye Bye"); // Si no, despedirse
        }
    }

    // Función para jugar una partida
    public static void jugarPartida(Scanner sc) {
        try {
            // Iniciar la primera ronda del juego
            System.out.println("Primera ronda: ");
            iniciarRonda(sc, 3); // Cada jugador elige 3 cartas en la primera ronda
            System.out.println("Presiona 1 para iniciar la siguiente ronda: ");
            sc.nextInt();

            // Iniciar la segunda ronda del juego
            System.out.println("Segunda ronda: ");
            iniciarRonda(sc, 6); // Cada jugador elige 3 cartas en la segunda ronda
            System.out.println("Presiona 1 para iniciar la siguiente ronda: ");
            sc.nextInt();

            // Iniciar la tercera ronda del juego
            System.out.println("Tercera ronda: ");
            iniciarRonda(sc, 9); // Cada jugador elige 3 cartas en la tercera ronda

            // Verificar quién ganó la partida
            Juego.verificarGanador();

            // Reiniciar los valores para una nueva partida
            numTurno = 0;
            Juego.resetearValoresJuego();
            System.out.println();
            System.out.println("¿Quieres jugar otra partida? 1 - Si / 2 - No");

            int respuesta = obtenerOpcion(sc, 1, 2); // Obtener la opción del usuario (1 o 2)
            if (respuesta == 1) {
                jugarPartida(sc); // Si elige jugar nuevamente, iniciar otra partida
            } else {
                System.out.println("Bye Bye"); // Si no, despedirse
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, ingresa un número válido.");
            sc.next(); 
            jugarPartida(sc); // Volver a iniciar la partida en caso de error
        }
    }

    // Función para iniciar una ronda
    public static void iniciarRonda(Scanner scanner, int num) {
        System.out.println("Aquí están tus cartas");

        // Generar las cartas para el jugador si es la primera ronda
        if (numTurno == 0) {
            Carta.generarCartas();
        }

        // Mostrar las cartas del jugador y del oponente
        juegocartas.Carta.mostrarCartas();
        juegocartas.Carta.mostrarCartas0();
        juegocartas.Carta.generarCartasOponente();
        System.out.println();
        juegocartas.Carta.mostrarCartas0();
        System.out.println();

        // Definir el turno (ataque o defensa) y pedir al jugador que elija sus cartas
        Juego.definirTurno();
        System.out.println("Elige 3 cartas para usarlas: 1-9 / Otro Número-Pasar");
        System.out.println();
        System.out.println("Tus cartas" + "           |            " + "Cartas oponente");

        // Proceso de elección de cartas por parte del jugador
        while (numTurno < num) {
            int cartaElegida = obtenerOpcion(scanner, 1, 9);
            procesoElegirCartas(cartaElegida, scanner);
        }

        // Comparar las cartas elegidas y determinar el ganador de la ronda
        System.out.println();
        Juego.compararCartas(Juego.turnoAoD);
        Juego.resetearTotales();
        Carta.resetearActivas();
    }

    // Función para procesar la elección de cartas por parte del jugador
    public static void procesoElegirCartas(int num, Scanner scanner) {
        if (num >= 1 && num <= 9) {
            switch (num) {
                // Proceso de elección de cada carta por parte del jugador
                // Se muestra un mensaje si la carta ya fue seleccionada anteriormente
                case 1:
                    if (Carta.carta1.activa) {
                        System.out.println("Ya has elegido esa carta. Prueba otra");
                        procesoElegirCartas(obtenerOpcion(scanner, 1, 9), scanner);
                    } else {
                        Carta.carta1.mostrarCarta(1);
                        Juego.sumarCarta(1);
                        Carta.carta1.activa = true;
                        Juego.respuestaOponente();
                        numTurno++;
                    }
                    break;
                case 2:
                    if (Carta.carta2.activa) {
                        System.out.println("Ya has elegido esa carta, prueba con otra");
                        procesoElegirCartas(obtenerOpcion(scanner, 1, 9), scanner);
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
                        System.out.println("Ya has elegido esa carta, prueba con otra");
                        procesoElegirCartas(obtenerOpcion(scanner, 1, 9), scanner);
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
                        System.out.println("Ya has elegido esa carta, prueba con otra");
                        procesoElegirCartas(obtenerOpcion(scanner, 1, 9), scanner);
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
                        System.out.println("Ya has elegido esa carta, prueba con otra");
                        procesoElegirCartas(obtenerOpcion(scanner, 1, 9), scanner);
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
                        System.out.println("Ya has elegido esa carta, prueba con otra");
                        procesoElegirCartas(obtenerOpcion(scanner, 1, 9), scanner);
                    } else {
                        Carta.carta6.mostrarCarta(6);
                        Juego.sumarCarta(6);
                        Carta.carta6.activa = true;
                        Juego.respuestaOponente();
                        numTurno++;
                    }
                    break;
                case 7:
                    if (Carta.carta7.activa) {
                        System.out.println("Ya has elegido esa carta, prueba con otra");
                        procesoElegirCartas(obtenerOpcion(scanner, 1, 9), scanner);
                    } else {
                        Carta.carta7.mostrarCarta(7);
                        Juego.sumarCarta(7);
                        Carta.carta7.activa = true;
                        Juego.respuestaOponente();
                        numTurno++;
                    }
                    break;
                case 8:
                    if (Carta.carta8.activa) {
                        System.out.println("Ya has elegido esa carta, prueba con otra");
                        procesoElegirCartas(obtenerOpcion(scanner, 1, 9), scanner);
                    } else {
                        Carta.carta8.mostrarCarta(8);
                        Juego.sumarCarta(8);
                        Carta.carta8.activa = true;
                        Juego.respuestaOponente();
                        numTurno++;
                    }
                    break;
                case 9:
                    if (Carta.carta9.activa) {
                        System.out.println("Ya has elegido esa carta, prueba con otra");
                        procesoElegirCartas(obtenerOpcion(scanner, 1, 9), scanner);
                    } else {
                        Carta.carta9.mostrarCarta(9);
                        Juego.sumarCarta(9);
                        Carta.carta9.activa = true;
                        Juego.respuestaOponente();
                        numTurno++;
                    }
                    break;
                default:
                    System.out.println("Has elegido pasar");
                    Juego.respuestaOponente();
                    numTurno++;
                    break;
            }
        }
    }

    // Función para obtener una opción válida del usuario
    public static int obtenerOpcion(Scanner scanner, int min, int max) {
        System.out.print("Ingresa tu opción: ");
        int opcion;
        try {
            opcion = scanner.nextInt();
            if (opcion < min || opcion > max) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, ingresa una opción válida.");
            scanner.nextLine(); 
            opcion = obtenerOpcion(scanner, min, max);
        }
        return opcion;
    }
}

