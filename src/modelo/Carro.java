package modelo;

public class Carro extends Vehiculo {
	
	private int num_puertas;
	private boolean isGasolina;
	
	
	public Carro(String placa, String marca, String referencia, String modelo, double precio, int num_ruedas,int num_puertas,boolean isGasolina) {
		super(placa, marca, referencia, modelo, precio, num_ruedas);
		
		this.num_puertas = num_puertas;
		this.isGasolina = isGasolina;
	}


	public Carro() {
		
	}


	public int getNum_puertas() {
		return num_puertas;
	}

	public void setNum_puertas(int num_puertas) {
		this.num_puertas = num_puertas;
	}

	public boolean isGasolina() {
		return isGasolina;
	}

	public void setGasolina(boolean isGasolina) {
		this.isGasolina = isGasolina;
	}

	@Override
	public String que_soy() {
		// TODO Auto-generated method stub
		System.out.println("soy un auto");
		return "carro";
	}
	
	public boolean en_venta() {
		
		return false;
	}
	

}
