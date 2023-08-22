package modelo;

import java.util.ArrayList;
import java.util.List;
import excepciones.VehiculoException;

public class Consecionario {

	private List<Vehiculo> lista_vehiculos;

	private List<Double> lista_ventas;
	
    private ArrayList<Vehiculo> vehiculos_disponibles = new ArrayList<>();

	
	public Consecionario() {

		this.lista_vehiculos = new ArrayList<>();
		this.lista_ventas = new ArrayList<>();
		
	}

	
	public ArrayList<Vehiculo> getVehiculos_disponibles() {
		return vehiculos_disponibles;
	}


	public void setVehiculos_disponibles(ArrayList<Vehiculo> vehiculos_disponibles) {
		this.vehiculos_disponibles = vehiculos_disponibles;
	}


	public List<Vehiculo> getLista_vehiculos() {
		return lista_vehiculos;
	}

	public void setVehiculos(List<Vehiculo> lista_vehiculos) {
		this.lista_vehiculos = lista_vehiculos;
	}

	public List<Double> getLista_ventas() {
		return lista_ventas;
	}

	public void setLista_ventas(List<Double> lista_ventas) {
		this.lista_ventas = lista_ventas;
	}

	public Vehiculo crear_moto(String placa, String marca, String referencia, String modelo, double precio,
			int num_ruedas, int cilindraje, double tam_tanque) throws VehiculoException {

		Moto nuevo_vehiculo = null;

		// verificar si el vehiculo existe

		
			boolean vehiculo_existe = verificar_vehiculo_existe(placa);

			if (vehiculo_existe) {
				throw new VehiculoException(" el vehiculo con placa " + placa + "ya existe");

				// creacion del vehiculo
			} else {
				nuevo_vehiculo = new Moto();
				nuevo_vehiculo.setPlaca(placa);
				nuevo_vehiculo.setMarca(marca);
				nuevo_vehiculo.setReferencia(referencia);
				nuevo_vehiculo.setModelo(modelo);
				nuevo_vehiculo.setPrecio(0);
				nuevo_vehiculo.setNum_ruedas(0);
				nuevo_vehiculo.setCilindraje(0);
				nuevo_vehiculo.setTam_tanque(0);
//				getLista_vehiculos().add(nuevo_vehiculo);

				
				System.out.println(" el vehiculo fue registrado");
			}
		

		return nuevo_vehiculo;

	}

	public Vehiculo crear_carro(String placa, String marca, String referencia, String modelo, double precio,
			int num_ruedas, int num_puertas, boolean isGasolina) throws VehiculoException {

		Carro nuevo_vehiculo = null;

		// verificar si el vehiculo existe

		boolean vehiculo_existe = verificar_vehiculo_existe(placa);

		if (vehiculo_existe) {
			throw new VehiculoException(" el vehiculo con placa " + placa + "ya existe");

			// creacion del vehiculo
		} else {
			nuevo_vehiculo = new Carro();
			nuevo_vehiculo.setPlaca(placa);
			nuevo_vehiculo.setMarca(marca);
			nuevo_vehiculo.setReferencia(referencia);
			nuevo_vehiculo.setModelo(modelo);
			nuevo_vehiculo.setPrecio(0);
			nuevo_vehiculo.setNum_ruedas(0);
			nuevo_vehiculo.setNum_puertas(0);
			nuevo_vehiculo.setGasolina(false);
			//getLista_vehiculos().add(nuevo_vehiculo);
			System.out.println(" el vehiculo fue registrado");
		}

		return nuevo_vehiculo;

	}

	public Vehiculo crear_camion(String placa, String marca, String referencia, String modelo, double precio,
			int num_ruedas, int cap_carga) throws VehiculoException {

		Camion nuevo_vehiculo = null;

		// verificar si el vehiculo existe

		boolean vehiculo_existe = verificar_vehiculo_existe(placa);

		if (vehiculo_existe) {
			throw new VehiculoException(" el vehiculo con placa " + placa + "ya existe");

			// creacion del vehiculo
		} else {
			nuevo_vehiculo = new Camion();
			nuevo_vehiculo.setPlaca(placa);
			nuevo_vehiculo.setMarca(marca);
			nuevo_vehiculo.setReferencia(referencia);
			nuevo_vehiculo.setModelo(modelo);
			nuevo_vehiculo.setPrecio(0);
			nuevo_vehiculo.setNum_ruedas(0);
			nuevo_vehiculo.setCap_carga(0);
			//getLista_vehiculos().add(nuevo_vehiculo);
			System.out.println(" el vehiculo fue registrado");

		}

		return nuevo_vehiculo;

	}

	// actualizar Carro
	public boolean actualizar_carro(String placa, String marca, String referencia, String modelo, double precio,
			int num_ruedas, int num_puertas, boolean isGasolina) throws VehiculoException {
		Carro act_vehiculo = null;
		boolean existe = false;
		// buscamos el carro que deseamos actualizar
		act_vehiculo = (Carro) obtener_vehiculo(placa);

		// si la placa ingresada no esta enlistada arrojara una excepcion
		if (act_vehiculo == null)
			throw new VehiculoException("El carro a actualizar no existe");
		// por lo contrario se procedera a realizar la actualizacion
		else {
			act_vehiculo = new Carro();
			act_vehiculo.setPlaca(placa);
			act_vehiculo.setMarca(marca);
			act_vehiculo.setReferencia(referencia);
			act_vehiculo.setModelo(modelo);
			act_vehiculo.setPrecio(0);
			act_vehiculo.setNum_ruedas(0);
			act_vehiculo.setNum_puertas(0);
			act_vehiculo.setGasolina(false);
			//getLista_vehiculos().add(act_vehiculo);
			System.out.println(" el vehiculo fue actualizado");
				}
		return existe;
	}

	// actualizar Moto
	public boolean actualizar_moto(String placa, String marca, String referencia, String modelo, double precio,
			int num_ruedas, int cilindraje, double tam_tanque) throws VehiculoException {
		Moto act_vehiculo = null;
		boolean existe = false;
		// buscamos la Moto que deseamos actualizar
		act_vehiculo = (Moto) obtener_vehiculo(placa);
		if (act_vehiculo == null)
			// si la placa ingresada no esta enlistada arrojara una excepcion
			throw new VehiculoException("El carro a actualizar no existe");
		// por lo contrario se procedera a realizar la actualizacion
		else {
			act_vehiculo = new Moto();
			act_vehiculo.setPlaca(placa);
			act_vehiculo.setMarca(marca);
			act_vehiculo.setReferencia(referencia);
			act_vehiculo.setModelo(modelo);
			act_vehiculo.setPrecio(0);
			act_vehiculo.setNum_ruedas(0);
			act_vehiculo.setCilindraje(0);
			act_vehiculo.setTam_tanque(0);
//			getLista_vehiculos().add(act_vehiculo);
			System.out.println(" el vehiculo fue actualizado");
	
		}
		return existe;
	}

	// actualizar Camion
	public boolean actualizar_camion(String placa, String marca, String referencia, String modelo, double precio,
			int num_ruedas, int cap_carga) throws VehiculoException {

		Camion act_vehiculo = null;
		boolean existe = false;
		// buscamos la Camion que deseamos actualizar
		act_vehiculo = (Camion) obtener_vehiculo(placa);
		if (act_vehiculo == null)
			// si la placa ingresada no esta enlistada arrojara una excepcion
			throw new VehiculoException("El carro a actualizar no existe");
		// por lo contrario se procedera a realizar la actualizacion
		else {
			act_vehiculo = new Camion();
			act_vehiculo.setPlaca(placa);
			act_vehiculo.setMarca(marca);
			act_vehiculo.setReferencia(referencia);
			act_vehiculo.setModelo(modelo);
			act_vehiculo.setPrecio(0);
			act_vehiculo.setNum_ruedas(0);
			act_vehiculo.setCap_carga(0);
//			getLista_vehiculos().add(act_vehiculo);
			System.out.println(" el vehiculo fue actualizado");
		}
		return existe;
	}

	// eliminar Vehiculo
	public void eliminar_vehiculo(String placa) throws VehiculoException {

		int posicion =0;
		int aux =0;
		
		Vehiculo vehiculo = null;
		
		for (Vehiculo v : vehiculos_disponibles) {
			if (v.getPlaca().equalsIgnoreCase("placa")) {
			posicion = aux;
			
			System.out.println("el vehiculo con placa: "+v.getPlaca()+ " fue eliminado");
			}
	 
		  aux++;
		}
		vehiculos_disponibles.remove(posicion);
		
	}

	// verificar si el vehiculo existe
	public boolean verificar_vehiculo_existe(String placa) throws VehiculoException {

		Vehiculo vehiculo = null;
		// pedimos la placa para realizar la verificacion
		vehiculo = obtener_vehiculo(placa);
		// si el vehiculo no existe se genera una excepcion
		if (vehiculo == null)
	
			return false;
		// y si existe
		else
			return true;
	}

	// obtener el vehiculo por Placa
	public Vehiculo obtener_vehiculo(String placa) throws VehiculoException {
		Vehiculo vehiculo_encontrado = null;
		// recorremos nuetra lista de veihiculo
		for (Vehiculo vehiculo : getLista_vehiculos()) {
			// se compara la placa,con las que se encuentre en la lista_vehiculos
			if (vehiculo.getPlaca().equalsIgnoreCase(placa)) {
				// si esta coincide terminara la busqueda
				vehiculo_encontrado = vehiculo;
				
			}
		}
		// y retornara ese Vehiculo
		return vehiculo_encontrado;
	}

	// obtener el vehiculo por Marca
	public Vehiculo obtener_vehiculo_marca(String marca) throws VehiculoException {
		Vehiculo vehiculo_encontrado = null;
		// recorremos nuetra lista de veihiculo
		for (Vehiculo vehiculo : getLista_vehiculos()) {
			// se compara la Marca,con las que se encuentre en la lista_vehiculos
			if (vehiculo.getMarca().equalsIgnoreCase(marca)) {
				// si esta coincide terminara la busqueda
				vehiculo_encontrado = vehiculo;

			}
		}
		// y retornara ese Vehiculo
		return vehiculo_encontrado;
	}

	// obtener el vehiculo por Precio
	public Vehiculo obtener_vehiculo_precio(double precio) throws VehiculoException {
		Vehiculo vehiculo_encontrado = null;
		// recorremos nuetra lista de veihiculo
		for (Vehiculo vehiculo : getLista_vehiculos()) {
			// se compara el Precio,con las que se encuentre en la lista_vehiculos
			if (vehiculo.getPrecio() == precio) {
				// si esta coincide terminara la busqueda
				vehiculo_encontrado = vehiculo;

			}
		}
		// y retornara ese Vehiculo
		return vehiculo_encontrado;
	}

	// obtener el vehiculo por Modelo
	public Vehiculo obtener_vehiculo_modelo(String modelo) {

		Vehiculo vehiculo_encontrado = null;
		// recorremos nuetra lista de veihiculo
		for (Vehiculo vehiculo : getLista_vehiculos()) {
			// se compara el Modelo,con las que se encuentre en la lista_vehiculos
			if (vehiculo.getModelo().equalsIgnoreCase(modelo)) {
				// si esta coincide terminara la busqueda
				vehiculo_encontrado = vehiculo;

			}
		}
		// y retornara ese Vehiculo
		return vehiculo_encontrado;
	}

	// obtener el vehiculo por Referencia
	public Vehiculo obtener_vehiculo_referencia(String referencia) {
		Vehiculo vehiculo_encontrado = null;
		// obtener el vehiculo por Modelo
		for (Vehiculo vehiculo : getLista_vehiculos()) {
			// se compara el Referencia,con las que se encuentre en la lista_vehiculos
			if (vehiculo.getReferencia().equalsIgnoreCase(referencia)) {
				// si esta coincide terminara la busqueda
				vehiculo_encontrado = vehiculo;

			}
		}
		// y retornara ese Vehiculo
		return vehiculo_encontrado;
	}

	// vender vehiculo
	public static Vehiculo vender_vehiculo(List<Vehiculo> lista_vehiculos, String placa) {
		// recorremos el listado de vehiculos
		for (Vehiculo vehiculo : lista_vehiculos) {
			// comparamos placa por placa
			if (vehiculo.getPlaca().equals(placa)) {
				// removemos el vehiculo de la lista vehiculos
				lista_vehiculos.remove(vehiculo);

				// y retornamos ese vehiculo
				return vehiculo;
			}
		}

		return null;
	}

	// agregar venta a Lista_ventas
	public void agregar_venta(double valor_venta) {

		lista_ventas.add(valor_venta);
	}
	
	public void agregar_vehiculo (Vehiculo vehiculo) {
		
		this.vehiculos_disponibles.add(vehiculo);
	}

	// calcular las ventas toltales
	public static double calcular_ventas_totales(ArrayList<Vehiculo> vehiculos_vendidos) {

		double total = 0.0;
		// recorremos el listado de ventas lista_ventas
		for (Vehiculo vehiculo : vehiculos_vendidos) {
			// y vamos a sumar las ventas
			total += vehiculo.getPrecio();
		}
		// retornamos el total
		return total;
	}
}
