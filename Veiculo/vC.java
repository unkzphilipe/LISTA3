package Veiculo;

public class vC extends veiculo {


public vC(String marca, String modelo, int ano, double valorKmRodado, double kmInicial, double kmFinal, double capCarga) {
		super(marca, modelo, ano, valorKmRodado, kmInicial, kmFinal);
		this.capCarga = capCarga;
		// TODO Auto-generated constructor stub
	}

public String toString() {
	return "Marca: "+ this.marca +"\n"+"Modelo: "+this.modelo+"\n"+"Ano: "+this.ano+"\n"+"Valor do Km: "+this.valorKmRodado+"\n"+"Km Inicial: "+this.kmInicial+"\n"+"Km Final: "+this.kmFinal+"\n"+"Capacidade de carga em kilos: "+this.capCarga+"\n";
}
private double capCarga;

public double getCapCarga() {
	return capCarga;
}

public void setCapCarga(double capCarga) {
	this.capCarga = capCarga;
}

}
