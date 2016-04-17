package www.unlam.edu.ar;

public class Cuadrado {
	
	private Double lado;
	private Double area;
	
	
	public void Cuadrado (Double lado){
		
		this.lado = lado;
	}
	
	
	public void calculaArea(){
		
		area = lado * lado;
		
	}
	
	public Double muestraArea(){
		
		return area;
	}

}
