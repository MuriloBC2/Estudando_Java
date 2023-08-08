package Calculadora;

import java.util.Scanner;

public class IMCCalculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Digite sua altura: ");
			double Altura = sc.nextDouble();
			System.out.println("Digite seu peso: ");
            double Peso = sc.nextDouble();
            
           double imc = Peso/(Altura*Altura);
           
           if (imc >= 18.5) {
        	   System.out.println("Você esta abaixo do esperado.");
           }else if (imc >= 25) {
        	   System.out.println("Você esta acima do esperado.");
           }else {
        	   System.out.println("Você esta saudavel");
           }
}
}