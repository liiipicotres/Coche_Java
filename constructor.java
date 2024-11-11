package Coche;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int peso_plataforma;
	private int motor;
	private int peso_coche;
	private	String color;
	private	boolean asientos_cuero, climatizador;
	

public Coche() {
	
	ruedas=4;
	largo=500;
	ancho=200;
	peso_plataforma=500;
	motor=250;
		
	
}

	public String decir_datos_generales() {//Método Getter
		
		return "La plataforma del vehículo tiene "+ruedas+" ruedas. Mide "+largo/100+" metros de largo y "+ancho/100+" metros de ancho. "
				+ "La plataforma pesa "+peso_plataforma+"kg y el motor pesa "+motor+"kg.";
	}
	
	public void establecer_color(String color_coche) { //Método Setter. "void" sirve para indicar que no va a devolver ningún dato, a diferencia del getter.
		color=color_coche;
	}
	
	public String devolver_color() {
		return "El color del coche es "+ color;
		
	}

	public void cuero_o_no(String asientos_de_cuero) {
		
		if(asientos_de_cuero.equalsIgnoreCase("Si")) {
			asientos_cuero=true;
		}else {
			asientos_cuero=false;
		}
	
	}
	
	public String dime_asientos() {
		
		if(asientos_cuero==true) {
			return "Los asientos son de cuero";
	}else {
			return "Los asientos no son de cuero";
		}
}
	
	public void climatizador_o_no(String climatizador) {
		if(climatizador.equalsIgnoreCase("Si")) {
			this.climatizador=true;
		
		}else {
			this.climatizador=false;
	}
}
	public String dime_climatizador() {
		
		if(climatizador==true) {
			
			return "El coche tiene climatizador";
		}else {
			return "El coche no tiene climatizador";
	}
}
	
	public String dime_peso_coche() { //Setter+Getter
		int peso_carroceria=500;
		peso_coche=peso_plataforma+peso_carroceria;
	
		
		if(asientos_cuero==true) {
			peso_coche=peso_coche+50;
		}
		
			if(climatizador==true) {
				
				peso_coche=peso_coche+20;
		}
			return "El peso del coche es de "+peso_coche+" kg";
	}
	
	public int precio_coche() {
		
		int precio_final=10000;
		
		if(climatizador==true) {
			precio_final+=1000;
		}
		
		if(asientos_cuero==true) {
			precio_final+=2000;
		}
		return precio_final;
		
	}
	
}
