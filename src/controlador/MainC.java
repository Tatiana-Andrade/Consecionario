package controlador;

import modelo.Vehiculo;
import modelo.Carro;
import modelo.Moto;
import modelo.Camion;
import modelo.Consecionario;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;

import excepciones.VehiculoException;
import modelo.Venta;

public class MainC {

	// Menu que permite seleccionar la accion que se desea, dentro de este hay un
	// SWITCH
	// en donde cada CASE es la accion que se eligio, tambien se encontrara con
	// condicionales (IF) los cuales sirven para ayudarnos a clasificar el tipo de
	// vehiculo

	public static void main(String[] args) throws VehiculoException {

		boolean bandera = true;
		
		Consecionario c = new Consecionario();

		ArrayList<Vehiculo> vehiculos_disponibles = new ArrayList<>();
		ArrayList<Vehiculo> vehiculos_vendidos = new ArrayList<>();

		vehiculos_disponibles.add(new Carro("A123", "Toyota", "2024", "Yaris", 910.00, 4, 4, true));
		vehiculos_disponibles.add( new Moto("B123", "SUZUKI", "2024", "V-STROM", 290.00, 2, 249, 4));
		vehiculos_disponibles.add( new Camion("C123", "Meercedes Benz", "2006", "Atego", 510.00, 4, 6255));
		
        
		String listado_disponibles = vehiculos_disponibles.toString();
		String listado_vendidos = vehiculos_vendidos.toString();
		// Mensaje que muestra las opciones a elegir y permite acceder a ellas

		do {
		String mensaje = " ✿ ✿ ! Bienvenido al Concesionario Spring ¡ ✿ ✿ \n\n "

				+ "Porfavor digite alguna de las siguientes opciones\n\n" 
				+" Registra un vehiculo ⓪ \n\n"
				+ " Actualiza un vehiculo ①\n\n"
				+ " Compra un vehiculo  ②\n\n" 
				+ " Elimina un vehiculo ③\n\n" 
				+ " Ver la lista de vehiculos existentes  ④ \n\n"
				+ " Ver la lista de Motos existentes  ⑤\n\n" 
				+ "  Ver la lista de Carros existentes⑥ \n\n"
				+ " Ver la lista de Camiones existentes   ⑦\n\n" 
				+ " Ver la lista de vehiculos vendidos  ⑧\n\n"
				+ "  Ver ventas totales ⑨\n\n"
				+ " Salir ⑩ \n\n";

		
		int menu = Integer.parseInt(JOptionPane.showInputDialog(mensaje));

		String opcion = "";

		switch (menu) {

		// Esta opcion es la que permite registrar un vehiculo

		case 0:

			String placa = JOptionPane.showInputDialog("Ingrese la placa");
			String marca = JOptionPane.showInputDialog("Ingrese la marca");
			String referencia = JOptionPane.showInputDialog("Ingrese la referencia");
			String modelo = JOptionPane.showInputDialog("Ingrese el modelo");
			double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
			int num_ruedas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ruedas"));

			 

			System.out.println("entro opcion 1");

			String a = " Porfavor digite si es una moto, carro o camion ";
			
			String b = JOptionPane.showInputDialog(a);
			opcion=b;

			System.out.println(opcion);
			// verifica si es una moto
			if (opcion.equalsIgnoreCase("moto")) {

				System.out.println(" moto--");
				int cilindraje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cilindraje"));
				double tam_tanque = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamanio del tamque"));

				Vehiculo vehiculo = new Moto(placa, marca, referencia, modelo, precio,
						 num_ruedas, cilindraje, tam_tanque);	
				vehiculos_disponibles.add(vehiculo);
				
				try {
					c.crear_moto(placa, marca, referencia, modelo, precio, num_ruedas, cilindraje, tam_tanque);

				} catch (VehiculoException e) {
					e.printStackTrace();

				}

				// verifica si es una carro
			} else if (opcion.equalsIgnoreCase("carro")) {
				System.out.println(" carro--");
				int num_puertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puertas: "));
				boolean isGasolina = Boolean.parseBoolean(
						JOptionPane.showInputDialog("Ingrese true si contiene gasolina o false si esta vacio: "));

				Vehiculo vehiculo = new Carro(placa, marca, referencia, modelo, precio,
						 num_ruedas, num_puertas, isGasolina);	
				vehiculos_disponibles.add(vehiculo);
				
				try {
					c.crear_carro(placa, marca, referencia, modelo, precio, num_ruedas, num_puertas, isGasolina);
				} catch (VehiculoException e) {
					e.printStackTrace();
				}
			}
			// verifica si es una camion
			else if (opcion.equalsIgnoreCase("camion")) {
				System.out.println("camion---");
				int cap_carga = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de carga"));
				
				Vehiculo vehiculo = new Camion(placa, marca, referencia, modelo, precio,
						 num_ruedas, cap_carga);	
				vehiculos_disponibles.add(vehiculo);
				
				try {
					c.crear_camion(placa, marca, referencia, modelo, precio, num_ruedas, cap_carga);
				} catch (VehiculoException e) {
					e.printStackTrace();
				}
			}

			break;

		// Esta opcion es la que permite actualizar un vehiculo

		case 1:
			opcion = "Actualizar un vehiculo";
			System.out.println("entro opcion 2");
			String f = " Porfavor digite si es una moto, carro o camion ";
			String g = JOptionPane.showInputDialog(f);
			opcion =g;
			placa = JOptionPane.showInputDialog("Ingrese la placa");
			marca = JOptionPane.showInputDialog("Ingrese la marca");
			referencia = JOptionPane.showInputDialog("Ingrese la referencia");
			modelo = JOptionPane.showInputDialog("Ingrese el modelo");
			precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
			num_ruedas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ruedas"));

//			verifica si es una moto
			if (opcion.equalsIgnoreCase("moto")) {

				int cilindraje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cilindraje"));
				double tam_tanque = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamanio del tamque"));
				
				Vehiculo vehiculo = new Moto(placa, marca, referencia, modelo, precio,
						 num_ruedas, cilindraje, tam_tanque);	
				vehiculos_disponibles.add(vehiculo);
				
				try {
					c.actualizar_moto(placa, marca, referencia, modelo, precio, num_ruedas, cilindraje, tam_tanque);
				} catch (VehiculoException e) {

					e.printStackTrace();
				}

				// verifica si es un carro
			} else if (opcion.equalsIgnoreCase("carro")) {

				int num_puertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puertas: "));
				boolean isGasolina = Boolean.parseBoolean(
						JOptionPane.showInputDialog("Ingrese True si contiene gasolina o False si esta vacio"));
				
				Vehiculo vehiculo = new Carro(placa, marca, referencia, modelo, precio,
						 num_ruedas, num_puertas, isGasolina);	
				vehiculos_disponibles.add(vehiculo);
				
				try {
					c.actualizar_carro(placa, marca, referencia, modelo, precio, num_ruedas, num_puertas, isGasolina);
				} catch (VehiculoException e) {
					e.printStackTrace();
				}

				// verifica si es una camion
			} else if (opcion.equalsIgnoreCase("camion")) {

				int cap_carga = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de carga"));
				
				Vehiculo vehiculo = new Camion(placa, marca, referencia, modelo, precio,
						 num_ruedas, cap_carga);	
				vehiculos_disponibles.add(vehiculo);
				
				try {
					c.actualizar_camion(placa, marca, referencia, modelo, precio, num_ruedas, cap_carga);
				} catch (VehiculoException e) {

					e.printStackTrace();
				}
			}

			break;

		// Esta opcion es la que permite comprar un vehiculo
		case 2:
			System.out.println("entro opcion 3");
			opcion = "Comprar un vehiculo";

			String placa_venta = JOptionPane.showInputDialog("Ingrese la placa del vehiculo que desee comprar: ");
			Vehiculo vehiculo_vendido = c.vender_vehiculo(vehiculos_disponibles, placa_venta);

			if (vehiculo_vendido != null) {
				vehiculos_vendidos.add(vehiculo_vendido);
				JOptionPane.showMessageDialog(null, "El vehiculo " + vehiculo_vendido.getPlaca() + " ha sido vendido");
			} else {

				JOptionPane.showMessageDialog(null, "no se a encontrado ningun vehiculo con placa " + placa_venta);
			}

			break;
			
		// Esta opcion es la que permite eliminar un vehiculo
		case 3:
			opcion = "Eliminar un vehiculo";
                c.setVehiculos_disponibles(vehiculos_disponibles);
				System.out.println("entro opcion 3");
				String placa5 = JOptionPane.showInputDialog("Ingrese la placa");
					
					c.eliminar_vehiculo(placa5);
				
			break;

		// Esta opcion es la que permite ver la lista de vehiculos que existen

		case 4:

			String w = "Listado de Vehiculos disponibles: \n ";
			for (Vehiculo vehiculo : vehiculos_disponibles) {
				w += "Placa:   \n" + vehiculo.getPlaca() + " Marca:  \n" + vehiculo.getMarca() + " Referencia:  \n"
						+ vehiculo.getReferencia() + " Modelo:  \n " + vehiculo.getModelo() + " Precio " +vehiculo.getPrecio()
						+ " numero de ruedas " + vehiculo.getNum_ruedas()+"\n";
			}
			System.out.println(w);
			JOptionPane.showMessageDialog(null, w);
			break;

			// Esta opcion es la que permite ver la lista de motos que existen
		case 5:

			String m = "Listado de Motos disponibles: \n";
			for (Vehiculo vehiculo : vehiculos_disponibles) {
				
             if (vehiculo.que_soy().equalsIgnoreCase("moto")) {
            	 
            	 m += "Placa:   \n" + vehiculo.getPlaca() + "Marca:  \n" + vehiculo.getMarca() + "Referencia:  \n"
 						+ vehiculo.getReferencia() + "Modelo:  \n " + vehiculo.getModelo() + "Precio : \n"
 						+ vehiculo.getPrecio() + "Numero de ruedas \n : " + vehiculo.getNum_ruedas() + "Cilindraje"
 						+ ((Moto) vehiculo).getCilindraje() + "Tamaño de tanque: " + ((Moto) vehiculo).getTam_tanque()+ "\n";

            	 
             }
				
			}
			JOptionPane.showMessageDialog(null, m);
			break;
			// Esta opcion es la que permite ver la lista de carros que existen
		case 6:

				String ñ = "Listado de Carros disponibles: \n";
				for (Vehiculo vehiculo : vehiculos_disponibles) {
					
					if (vehiculo.que_soy().equalsIgnoreCase("carro")) {
						
					ñ += "Placa:   \n" + vehiculo.getPlaca() + "Marca:  \n" + vehiculo.getMarca() + "Referencia:  \n"
							+ vehiculo.getReferencia() + "Modelo:  \n " + vehiculo.getModelo() + "Precio : \n"
							+ vehiculo.getPrecio() + "Numero de ruedas \n : " + vehiculo.getNum_ruedas()
							+ "numero de puertasdas" + ((Carro) vehiculo).getNum_puertas() + "Tiene gasolina : \n"
							+ ((Carro) vehiculo).isGasolina()+"\n";
				  }
				}
				JOptionPane.showMessageDialog(null, ñ);
				break;
		// Esta opcion es la que permite ver la lista de camiones que existen
		case 7:

			String o = "Listado de Camiones disponibles: \n";
			for (Vehiculo vehiculo : vehiculos_disponibles) {
				if (vehiculo.que_soy().equalsIgnoreCase("moto")) {
					
				
				o += "Placa:   \n" + vehiculo.getPlaca() + "Marca:  \n" + vehiculo.getMarca() + "Referencia:  \n"
						+ vehiculo.getReferencia() + "Modelo:  \n " + vehiculo.getModelo() + "Precio : \n"
						+ vehiculo.getPrecio() + "Numero de ruedas \n : " + vehiculo.getNum_ruedas()
						+ "Capacidad de Carga : \n" + ((Camion) vehiculo).getCap_carga()+"\n";

			   }
			}
			JOptionPane.showMessageDialog(null, o);
			break;
			// Esta opcion es la que permite ver la lista de vehiculos vendidos
		case 8:

			String y = "Listado de vehiculos vendidos: \n";
			for (Vehiculo vehiculo : vehiculos_vendidos) {
				y += "Placa:   \n" + vehiculo.getPlaca() + "Marca:  \n" + vehiculo.getMarca() + "Referencia:  \n"
						+ vehiculo.getReferencia() + "Modelo:  \n " + vehiculo.getModelo() + vehiculo.getPrecio()
						+ "numero de ruedas" + vehiculo.getNum_ruedas()+"\n";
			}
			JOptionPane.showMessageDialog(null, y);
			break;

			// Esta opcion es la que permite ver la lista de ventas
		case 9: 
			
			double total = c.calcular_ventas_totales(vehiculos_vendidos);
			JOptionPane.showMessageDialog(null, " el valor total de las ventas es: " + total);

			break;

//			opcion para cerrar softwares
		case 10:
			
			bandera = false;
		
			break;
				
				
		}
		
	

	}while(bandera);
	}
}
