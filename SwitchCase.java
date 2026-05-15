package com.meuprojeto;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double A,B;
int Opçoes;
System.out.println("-----Opções------");
System.out.println("1 - Soma");
System.out.println("2 - Subtração");
System.out.println("3 - Multiplicação");
System.out.println("4 - Divisão");
System.out.println("5 - Porcentagem");
System.out.println("6 - Potência");
System.out.println("7 - Raiz quadrada");
System.out.println("8 - Média");
System.out.println("Escolha uma opção!");
Opçoes = sc.nextInt();
switch (Opçoes) {
case 1:
	System.out.println("Escolha o primeiro número: ");
	A = sc.nextDouble();
	System.out.println("Escolha o segundo número: ");
	B = sc.nextDouble();
System.out.println("A soma dos dois números é: " + (A+B));
break;
case 2:
	System.out.println("Escolha o primeiro número: ");
	A = sc.nextDouble();
	System.out.println("Escolha o segundo número: ");
	B = sc.nextDouble();
	System.out.println("A subtração dos dois números é: " + (A-B));
	break;
case 3:
	System.out.println("Escolha o primeiro número: ");
	A = sc.nextDouble();
	System.out.println("Escolha o segundo número: ");
	B = sc.nextDouble();
	System.out.println("A multiplicação entre esses dois termos é: " + (A*B));
	break; 
case 4:
	System.out.println("Escolha o primeiro número: ");
	A = sc.nextDouble();
	System.out.println("Escolha o segundo número: ");
	B = sc.nextDouble();
	System.out.println("A divisão entre esses dois é: " + (A/B));
	if (B != 0) {
        System.out.println("A divisão entre esses dois é: " + (A / B));
    } else {
        System.out.println("Erro: Não é possível dividir por zero.");
    }
	break;
case 5:
	System.out.println("Informe o valor total: ");
	A = sc.nextDouble();
	System.out.println("Informe a porcentagem que deseja calcular");
	B = sc.nextDouble();
	double ResultadoFinal = (B/100)*A;
	System.out.println("O resultado é: " + ResultadoFinal);
	break;
case 6: 
	System.out.println("Informe a base: ");
	A = sc.nextDouble();
	System.out.println("Informe a potência");
	B = sc.nextDouble();
	double resultado = Math.pow(A, B);
	System.out.println("Resultado = " + resultado);
	break;
case 7: 
	System.out.println("Informe um número: ");
	A = sc.nextDouble();
	double Resultado = Math.sqrt(A);
	System.out.println("Resultado = " + Resultado);
	break;
case 8:
	double numero, Media, Soma = 0, C = 0;
	char continuar;
	do {
		System.out.println("Informe um número: ");
		numero = sc.nextDouble();
		Soma += numero;
		C++;
	System.out.println("Deseja continuar?: S/N");
	continuar = sc.next().toUpperCase().charAt(0);
	}while(continuar == 'S');
	if(C > 0) {
		Media = Soma/C;
		System.out.println("A media é: " + Media);
	}
	default:
		System.out.println("Opção não declarada, escolha outra!!");
		break;
}
}
}
