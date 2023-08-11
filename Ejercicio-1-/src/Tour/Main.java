package Tour;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Localidad> localidades = new ArrayList<>();
            localidades.add(new Localidad("Localidad 1", 100, 20));
            localidades.add(new Localidad("Localidad 5", 500, 20));
            localidades.add(new Localidad("Localidad 10", 1000, 20));

            Comprador comprador = new Comprador("Juan Pérez", "juan@example.com", 0, 1500);

            while (true) {
                System.out.println("Bienvenido al sistema de compra de boletos");
                System.out.println("Nombre del comprador: " + comprador.getNombre());
                System.out.println("Boletos disponibles:");

                for (int i = 0; i < localidades.size(); i++) {
                    Localidad localidad = localidades.get(i);
                    System.out.println(i + ". " + localidad.getNombre() +
                            " - Precio: $" + localidad.getPrecio() +
                            " - Espacio disponible: " + (localidad.getCapacidad() - localidad.getBoletosVendidos()));
                }

                System.out.println("Ingrese el número de la localidad a comprar (o -1 para salir):");

                int opcion;
                try {
                    opcion = scanner.nextInt();
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Error: Ingresa un número válido.");
                    scanner.nextLine(); // Limpia el buffer de entrada
                    continue;
                }

                if (opcion == -1) {
                    break;
                }

                if (opcion >= 0 && opcion < localidades.size()) {
                    Localidad localidadSeleccionada = localidades.get(opcion);

                    System.out.println("Ingrese la cantidad de boletos a comprar:");
                    int cantidadBoletos = scanner.nextInt();

                    if (cantidadBoletos > 0 && cantidadBoletos <= localidadSeleccionada.getCapacidad() - localidadSeleccionada.getBoletosVendidos()) {
                        int costoTotal = cantidadBoletos * localidadSeleccionada.getPrecio();

                        if (costoTotal <= comprador.getPresupuestoMaximo()) {
                            localidadSeleccionada.venderBoletos(cantidadBoletos);
                            comprador.setCantidadBoletos(comprador.getCantidadBoletos() + cantidadBoletos);
                            comprador.setPresupuestoMaximo(comprador.getPresupuestoMaximo() - costoTotal);
                            System.out.println("Compra exitosa. Total a pagar: $" + costoTotal);
                        } else {
                            System.out.println("No tienes suficiente presupuesto para realizar esta compra.");
                        }
                    } else {
                        System.out.println("La cantidad de boletos ingresada es inválida o no hay suficiente espacio disponible.");
                    }
                } else {
                    System.out.println("Opción inválida.");
                }
            }
        } // Cierre del bloque try

        System.out.println("Gracias por usar el sistema de compra de boletos. ¡Hasta luego!");
    }
}
