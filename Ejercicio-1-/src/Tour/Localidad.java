package Tour;

class Localidad {
    private String nombre;
    private int precio;
    private int capacidad;
    private int boletosVendidos;

    public Localidad(String nombre, int precio, int capacidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.capacidad = capacidad;
        this.boletosVendidos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getBoletosVendidos() {
        return boletosVendidos;
    }

    public int getBoletosDisponibles() {
        return capacidad - boletosVendidos;
    }

    public boolean tieneEspacio() {
        return boletosVendidos < capacidad;
    }

    public void venderBoletos(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad de boletos a vender debe ser positiva.");
            return;
        }
        if (cantidad > capacidad - boletosVendidos) {
            cantidad = capacidad - boletosVendidos;
        }
        boletosVendidos += cantidad;
    }

    // Agregar setters si es necesario
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
