import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		double x, y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe um número e depois outro para que seja realizado as quatro operações simples: ");
		x = sc.nextDouble();
		System.out.print("Informe outro número: ");
		y = sc.nextDouble();
		double soma = x + y;
		System.out.println("A soma é: " + soma);
		double sub = x - y;
		System.out.println("A subtração entre eles é: " + sub);
		double mult = x * y;
		System.out.println("A multiplicação é: " + mult);
		double div = x/y;
		System.out.println("A divisão é: " + div);
	}
}