package Fitas;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	int qnt =0;
	fitasLan f1 = new fitasLan();
	fitasInf f2 = new fitasInf();
	Fitas f3 = new Fitas();
	f3.setPreco(1);
	f1.setPreco(1);
	f2.setPreco(1);
	Scanner read = new Scanner(System.in);
	System.out.println("::: Digite: 1 - para Fitas, 2  - fitas infantis, 3 - fitas lançamentos :::");
	int opt = read.nextInt();
	switch (opt) {
	case 1:
		System.out.println("Quantas fitas deseja alugar?");
		 qnt = read.nextInt();
		System.out.print(f3.preco * qnt);
		break;
	case 2:
		System.out.println("Quantas fitas deseja alugar?");
		 qnt = read.nextInt();
		System.out.print(f2.precLoc() * qnt);
		break;
	case 3:
		System.out.println("Quantas fitas deseja alugar?");
		 qnt = read.nextInt();
		System.out.print(f1.precLoc() * qnt);
		break;
		default:
			opt = read.nextInt();
			break;
	}
	read.close();
}
}
