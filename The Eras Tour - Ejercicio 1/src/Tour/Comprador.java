package Tour;

	class Comprador {
	    private String nombre;
	    private String email;
	    private int cantidadBoletos;
	    private int presupuestoMaximo;

	    public Comprador(String nombre, String email, int cantidadBoletos, int presupuestoMaximo) {
	        this.nombre = nombre;
	        this.email = email;
	        this.cantidadBoletos = cantidadBoletos;
	        this.presupuestoMaximo = presupuestoMaximo;
	    }

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

	    public void agregarBoletos(int cantidad) {
	        cantidadBoletos += cantidad;
	    }

	    public void restarPresupuesto(int cantidad) {
	        presupuestoMaximo -= cantidad;
	    }
	}


