package com.meuprojeto;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
//Informar o dia da semana, dado que domingo equivale a 1;
//switch(estrutura de seleção) aceita somente: byte, char, int, String, enum, short;
Scanner sc = new Scanner(System.in);
int Opcoes;
System.out.println("1 - Domingo");
System.out.println("2 - Segunda");
System.out.println("3 - Terça");
System.out.println("4 - Quarta");
System.out.println("5 - Quinta");
System.out.println("6 - Sexta");
System.out.println("7 - Domingo");
System.out.println("Informe o dia!");
Opcoes = sc.nextInt();
switch(Opcoes) {
case 1: 
	System.out.println("Hoje é domingo!");
	break;
case 2: 
	System.out.println("Hoje é Segunda!");
	break;
case 3: 
	System.out.println("Hoje é Terça!");
	break;
case 4: 
	System.out.println("Hoje é Quarta!");
	break;
case 5:
	System.out.println("Hoje é Quinta!");
	break;
case 6: 
	System.out.println("Hoje é Sexta!");
	break;
case 7: 
	System.out.println("Hoje é Sabado!");
}
	sc.close();
	}

}
