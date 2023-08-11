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

	    public boolean tieneEspacio() {
	        return boletosVendidos < capacidad;
	    }

	    public void venderBoletos(int cantidad) {
	        if (cantidad > capacidad - boletosVendidos) {
	            cantidad = capacidad - boletosVendidos;
	        }
	        boletosVendidos += cantidad;
	    }
	}


