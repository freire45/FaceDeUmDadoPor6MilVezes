package br.com.erickfreire.facedeumdado6milvezes;

import java.security.SecureRandom;

/**
 * Programa em Java que lança um dado 6 mil vezes e mostra quantas vezes saiu cada numero.
 * @author Erick Freire
 * @version 1 - Criado em 25-04-2021 as 23:49
 */

public class FaceDeUmDadoPor6MilVezes {

	public static void main(String[] args) {
		
		SecureRandom numeroAleatorio = new SecureRandom();
		
		int frequencia1 = 0;
		int frequencia2 = 0;
		int frequencia3 = 0;
		int frequencia4 = 0;
		int frequencia5 = 0;
		int frequencia6 = 0;
		
		for(int jogada = 1; jogada <= 6000; jogada++) {
			
			int face = 1 + numeroAleatorio.nextInt(6);
			
			switch(face)
			{
			case 1:
				++frequencia1;
				break;
			case 2:
				++frequencia2;
				break;
			case 3:
				++frequencia3;
				break;
			case 4:
				++frequencia4;
				break;
			case 5:
				++frequencia5;
				break;
			case 6:
				++frequencia6;
				break;
			}
			
		}
		
		System.out.println("Face\tFrequencia");
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequencia1, frequencia2, frequencia3, frequencia4, frequencia5, frequencia6);

	}

}
