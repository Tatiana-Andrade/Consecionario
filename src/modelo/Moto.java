package modelo;

public class Moto extends Vehiculo{

	private int cilindraje;
	private double  tam_tanque;
	
	public Moto () {
		
	}
	
	public Moto(String placa, String marca, String referencia, String modelo, double precio, int num_ruedas,int cilindraje, double tam_tanque) {
		super(placa, marca, referencia, modelo, precio, num_ruedas);
		this.cilindraje = cilindraje;
		this.tam_tanque = tam_tanque;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public double getTam_tanque() {
		return tam_tanque;
	}

	public void setTam_tanque(double tam_tanque) {
		this.tam_tanque = tam_tanque;
	}

	@Override
	public String que_soy() {
		
		System.out.println(" soy una moto");
		return "moto";
		
	}
    public boolean en_venta() {
		
		return false;
	}
	
	

}
