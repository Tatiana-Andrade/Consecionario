package modelo;

public abstract class Vehiculo {
	private String placa;
	private String marca ;
	private String referencia;
	private String modelo;
	private double precio;
	private int num_ruedas;

	
	public Vehiculo() {
		placa="";
		marca= "";
		referencia= " ";
		modelo= " ";
	    precio=0;
		num_ruedas=0;
	}

	// constructor con sus atributos
	
	public Vehiculo(String placa, String marca, String referencia, String modelo, double precio, int num_ruedas) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.referencia = referencia;
		this.modelo = modelo;
		this.precio = precio;
		this.num_ruedas = num_ruedas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getNum_ruedas() {
		return num_ruedas;
	}

	public void setNum_ruedas(int num_ruedas) {
		this.num_ruedas = num_ruedas;
	}
	
	
 
	public abstract String que_soy();
	
	public abstract boolean en_venta();
	
}

      
