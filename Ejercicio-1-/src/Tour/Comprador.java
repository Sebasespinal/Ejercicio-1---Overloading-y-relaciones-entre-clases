package Tour;

class Comprador {
    private String nombre;
    private String email;
    private int cantidadBoletos;
    private int presupuestoMaximo;

    // Constructor para inicializar los atributos
    public Comprador(String nombre, String email, int cantidadBoletos, int presupuestoMaximo) {
        this.nombre = nombre;
        this.email = email;
        // Utilizamos los métodos setter para asegurar que las restricciones se apliquen correctamente
        this.setCantidadBoletos(cantidadBoletos);
        this.setPresupuestoMaximo(presupuestoMaximo);
    }

    // Métodos getters para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getCantidadBoletos() {
        return cantidadBoletos;
    }

    public int getPresupuestoMaximo() {
        return presupuestoMaximo;
    }

    // Método para agregar boletos
    public void agregarBoletos(int cantidad) {
        setCantidadBoletos(getCantidadBoletos() + cantidad);
    }

    // Método para restar presupuesto
    public void restarPresupuesto(int cantidad) {
        setPresupuestoMaximo(getPresupuestoMaximo() - cantidad);
    }

    // Métodos setters para actualizar los atributos y aplicar restricciones
    public void setCantidadBoletos(int cantidadBoletos) {
        if (cantidadBoletos >= 0) {
            this.cantidadBoletos = cantidadBoletos;
        } else {
            System.out.println("La cantidad de boletos no puede ser negativa.");
        }
    }

    public void setPresupuestoMaximo(int presupuestoMaximo) {
        if (presupuestoMaximo >= 0) {
            this.presupuestoMaximo = presupuestoMaximo;
        } else {
            System.out.println("El presupuesto máximo no puede ser negativo.");
        }
    }
}
