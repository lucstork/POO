package Atv04;

public abstract class Caminhao extends Veiculo{
	private Integer num_eixos;
	private double carga;
	
	public Integer getNum_eixos() {
		return num_eixos;
	}
	public void setNum_eixos(Integer num_eixos) {
		this.num_eixos = num_eixos;
	}
	
	public double getCarga() {
		return carga;
	}
	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	
	public abstract String todosDados();
	
}
