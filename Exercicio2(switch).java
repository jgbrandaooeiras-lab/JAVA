package com.meuprojeto;
import java.util.Scanner;
public class ExercicioSwitch2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//utilizando switch e dado os valores de 1 a 7, imprima se é dia util ou final de semana;
		//Considerando 1 como domingo
		int Opcoes;
		System.out.println("----Opcoes----");
		System.out.println("1 - Domingo");
		System.out.println("2 - Segunda");
		System.out.println("3 - Terça");
		System.out.println("4 - Quarta");
		System.out.println("5 - Quinta");
		System.out.println("6 - Sexta");
		System.out.println("7 - Sabado");
		System.out.println("Informe o dia: 1");
		Opcoes = sc.nextInt();
		switch(Opcoes) {
		case 1:
			System.out.println("Final de semana");
			break;
		case 2:
			System.out.println("Dia útil");
			break;
		case 3:
			System.out.println("Dia útil");
			break;
		case 4: 
			System.out.println("Dia útil");
			break;
		case 5:
			System.out.println("Dia útil");
			break;
		case 6:
			System.out.println("Dia útil");
			break;
		case 7:
			System.out.println("Final de semana");
			break;
			default: 
				System.out.println("Opção inválida!");
		}
		sc.close();
	}

}
