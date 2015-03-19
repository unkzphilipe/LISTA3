package Fitas;

public class Fitas {
protected String titulo;
protected double preco;
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
 public void precLoc(double acres) {
	 this.preco += this.preco*acres;
 }
}

