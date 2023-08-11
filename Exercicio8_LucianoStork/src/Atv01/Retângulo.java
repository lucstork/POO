package Atv01;

public abstract class Retângulo {
		private double altura;
		private double largura;
		
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}

		public double getLargura() {
			return largura;
		}
		public void setLargura(double largura) {
			this.largura = largura;
		}

		public abstract String area();
}


