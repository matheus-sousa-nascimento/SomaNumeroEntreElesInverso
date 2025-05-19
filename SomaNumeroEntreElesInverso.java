/*
 * SomaNumeroEntreElesInverso.java
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;
public class SomaNumeroEntreElesInverso {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		//Matheus de sousa do nascimento
		int n1 = 0, n2 = 0, soma = 0, aux = 0;
		
		System.out.print("Digite um numero: ");
		n1 = entrada.nextInt();
		
		System.out.print("Digite outro numero: ");
		n2 = entrada.nextInt();
		
		if (n1 > n2){
		
		aux = n1;
		n1 = n2;
		n2 = aux;
		aux = n1;
		}
		
		
		do{
			
			soma+=aux;
			aux++;
			} while(aux <= n2);
			
			System.out.print("A soma dos numeros "+n1+" e "+n2+" e os numeros entre eles e "+soma);
	}
}

