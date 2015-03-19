package Veiculo;

public class vP extends veiculo {

public vP(String marca, String modelo, int ano, double valorKmRodado, double kmInicial, double kmFinal, int qntPorta, boolean ar) {
		super(marca, modelo, ano, valorKmRodado, kmInicial, kmFinal);
		this.qntPorta = qntPorta;
		this.arCon = ar;
	}
private boolean arCon;
private int qntPorta;

public String toString() {
	return "Marca: "+ this.marca +"\n"+"Modelo: "+this.modelo+"\n"+"Ano: "+this.ano+"\n"+"Valor do Km: "+this.valorKmRodado+"\n"+"Km Inicial: "+this.kmInicial+"\n"+"Km Final: "+this.kmFinal+"\n"+"Quantidades de portas: "+this.qntPorta+"\n"+"Ar condicionado: "+this.arCon+"\n";
}
public boolean isArCon() {
	return arCon;
}
public void setArCon(boolean arCon) {
	this.arCon = arCon;
}
public int getQntPorta() {
	return qntPorta;
}
public void setQntPorta(int qntPorta) {
	this.qntPorta = qntPorta;
}
}
