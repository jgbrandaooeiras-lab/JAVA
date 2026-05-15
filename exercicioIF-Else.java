package com.meuprojeto;

public class Projeto2 {

	public static void main(String[] args) {	
		// Taxa de 2020 da Holanda, descobrir quanto devo pagar
		// De € 0 até € 34.712 -- 9,7%
		//De € 34.713 até € 68.507 -- 37,35%
		//Acima de € 68.508 -- 49,50%
double SalarioAnual = 70000;
double TaxaBaixa = 9.7/100;
double TaxaMedia = 37.35/100;
double TaxaAlta = 49.50/100;
double Resultado;
if(SalarioAnual <= 34712) {
	Resultado = SalarioAnual*TaxaBaixa;
}
else if(SalarioAnual >= 34712 && SalarioAnual <= 68507) {
	Resultado = SalarioAnual*TaxaMedia;
}
else {
	Resultado = SalarioAnual*TaxaAlta;
}
System.out.println("Total a pagar: " + Resultado);
	}

}
