
package POO7;


public class Celda {
        
        private String nombre;
        private boolean estaAbierta;
        private int codigoSeguridad;

    //constructor
    public Celda(String nombre, boolean estaAbierta, int codigoSeguridad) {
        super(); //Para heredar los demas atributos
        this.nombre = nombre;
        this.estaAbierta = estaAbierta;
        if(codigoSeguridad >= 0 && codigoSeguridad <= 9999){
            this.codigoSeguridad = codigoSeguridad;
        }else{
            this.codigoSeguridad = 0;
        }   
    }
    
    public Celda(String nombre, int codigoSeguridad) {
		super();
		this.nombre = nombre;
		this.estaAbierta = false;
		this.codigoSeguridad = codigoSeguridad;
	}
	
	public Celda () {
		super();
		this.nombre = "celda 0";
		this.estaAbierta = false;
		this.codigoSeguridad = 0;
	}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstaAbierta() {
        return estaAbierta;
    }

    public void setEstaAbierta(boolean estaAbierta) {
        this.estaAbierta = estaAbierta;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(int codigoSeguridad){
        if(codigoSeguridad <= 9999 && codigoSeguridad >= 0){
            this.codigoSeguridad = codigoSeguridad;
             }
        }
    }

