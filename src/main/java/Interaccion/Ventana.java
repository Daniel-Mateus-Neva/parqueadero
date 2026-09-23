package Interaccion;

import edu.unilibre.datos.TipoPago;
import gestion.GestorParqueadero;
import java.util.Scanner;

public class Ventana {
    private GestorParqueadero gestor;
    private Scanner scanner;

    public Ventana() {
        this.gestor = new GestorParqueadero();
        this.scanner = new Scanner(System.in);
    }

    public void iniciarMenu() {
        int opcion = 0;
        do {
            System.out.println("\n========================================");
            System.out.println("   SISTEMA DE PARQUEADERO   BICICLETAS   ");
            System.out.println("========================================");
            System.out.println("1. Adicionar Bicicleta");
            System.out.println("2. Registrar Salida de Bicicleta");
            System.out.println("3. Ver Reporte del Día");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Por favor ingrese un número válido.");
                scanner.next(); // Limpiar entrada incorrecta
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Adicionar Bicicleta ---");
                    System.out.print("Ingrese el número de serial: ");
                    int serial = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el color de la bicicleta: ");
                    String color = scanner.nextLine();

                    System.out.print("Ingrese el documento del propietario: ");
                    int documento = scanner.nextInt();

                    boolean agregado = gestor.adicionarBici(serial, color, documento);
                    if (agregado) {
                        System.out.println("¡Bicicleta adicionada con éxito al parqueadero!");
                    } else {
                        System.out.println("No se pudo adicionar. El parqueadero está lleno (20 cupos).");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Registrar Salida ---");
                    System.out.print("Ingrese el documento del propietario para retirar la bicicleta: ");
                    int docSalida = scanner.nextInt();

                    System.out.println("Seleccione el método de pago:");
                    System.out.println("1. EFECTIVO");
                    System.out.println("2. TARJETA");
                    System.out.print("Opción de pago: ");
                    int opPago = scanner.nextInt();

                    TipoPago metodoPago = TipoPago.EFECTIVO;
                    if (opPago == 2) {
                        metodoPago = TipoPago.TARJETA;
                    }

                    boolean salidaExitosa = gestor.registrarSalidaBici(docSalida, metodoPago);
                    if (salidaExitosa) {
                        System.out.println("Salida registrada con éxito. Cupo liberado.");
                        System.out.println("Método de pago registrado: " + metodoPago);
                    } else {
                        System.out.println("No se encontró ninguna bicicleta activa con ese documento.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Reporte del Día ---");
                    String reporte = gestor.generarReporte();
                    System.out.println(reporte);
                    break;

                case 4:
                    System.out.println("Saliendo del sistema del parqueadero. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("⚠️ Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 4);
    }
}
