package Coche;

import javax.swing.*;
public class Uso_Coche {

	public static void main(String[] args) {
		
		
		
		Coche Audi=new Coche();
	

		System.out.println(Audi.decir_datos_generales());
		
		
		Audi.establecer_color(JOptionPane.showInputDialog("Introduzca el color del coche"));
		
		System.out.println(Audi.devolver_color());
		
		
		Audi.cuero_o_no(JOptionPane.showInputDialog("El coche tiene asientos de cuero? si/no"));
		
		System.out.println(Audi.dime_asientos());
		
		Audi.climatizador_o_no(JOptionPane.showInputDialog("El Coche tiene climatizador? si/no"));
		System.out.println(Audi.dime_climatizador());
		
		Audi.precio_coche();
		System.out.println("El precio final del coche es de "+Audi.precio_coche()+" Euros");
		
	}

}
