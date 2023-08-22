package modelo;

public class Camion extends Vehiculo{
	
	private int cap_carga;
	
	public Camion() {
		
	}

	public Camion(String placa, String marca, String referencia, String modelo, double precio, int num_ruedas, int cap_carga) {
		super(placa, marca, referencia, modelo, precio, num_ruedas);
		this.cap_carga = cap_carga;
	}

	
	public int getCap_carga() {
		return cap_carga;
	}


	public void setCap_carga(int cap_carga) {
		this.cap_carga = cap_carga;
	}


	@Override
	public String que_soy() {
		System.out.println("soy un camion");
		return "camion";
	}
	
    public boolean en_venta() {
		
		return false;
	}
	

}
