package Veiculo;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	int opt =0;
	double km =0;
	veiculo uno = new veiculo("Fiat", "Uno Smart", 2014, 10, 10, 50);
	vC caminhao = new vC("Scania", "Scania Trovao", 2014, 20, 10, 100, 1000);
	vP ferrari = new vP("Ferrari", "Enzo", 2015, 50, 0, 200, 2, true);
	
	
	System.out.println("Você deseja calcular o valor da locação de qual veículo?");
	System.out.println("1. uno\n2.caminhão\n3.ferrari");
	Scanner read = new Scanner(System.in);
	opt= read.nextInt();
	switch (opt) {
	case 1:
		System.out.println(uno.toString());
		System.out.println("Quantos quilometros foram rodados?");
		 km = read.nextDouble();
		uno.setValorKmRodado(km);
		System.out.println(uno.vLoc());
			break;
	case 2:
		System.out.println(caminhao.toString());
		System.out.println("Quantos quilometros foram rodados?");
		 km = read.nextDouble();
		caminhao.setValorKmRodado(km);
		System.out.println(caminhao.vLoc());
		break;

	case 3:
		System.out.println(ferrari.toString());
		System.out.println("Quantos quilometros foram rodados?");
	 km = read.nextDouble();
		ferrari.setValorKmRodado(km);
		System.out.println(ferrari.vLoc());
		break;
	default:
		opt= read.nextInt();
		break;
	}
	read.close();
}
}
