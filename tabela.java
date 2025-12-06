package QuestaoUm;

import java.util.Scanner;

public class questFormat {
	public static void main(String[] args) {
		String caractOne, caractTwo;
		int quant;
		boolean close = true;
		
		Scanner leitura = new Scanner(System.in);
		
		do {
		System.out.println("Digite um caractere:");
		caractOne = leitura.next();
		quant = caractOne.length();	
		
		if(quant >=2) {
			close = false;
			System.err.println("Você digitou mais de um caractere!");
			System.out.print("\n");
		}else {
			close = true;
		}
		}while(close != true);
		
		
		do {
		System.out.println("Digite outro caractere:");
		caractTwo = leitura.next();
		quant = caractTwo.length();
		
		if(quant >= 2) {
			close = false;
			System.err.println("Você digitou mais de caractere!");
			System.out.print("\n");
		}else {
			close = true;
		}
		
		}while(close != true);
		
		System.out.println("Digite a quantidade:");
		quant = leitura.nextInt();
		
		String[][] array = new String[quant][quant];
		
		preencher(array, caractOne, caractTwo);
		exibir(array);
	}
	
	public static void preencher(String[][] array, String caract, String caractDois ) {
		/*
		 * i = linha
		 * j = coluna
		 * 
		 * A lógica:
		 *  1- IF - Quando a linha e a colona ter o mesmo valor, o array recebe um espaço 
		 *  2- ELSE IF - Quando a columa for divisivel por 2, ele passa direto
		 *  	Se não o array recebe o primeiro caractere 
		 *  3- ELSE IF - Quando a linha for divisil por 2, ele passa direto 
		 *  	Se não o array recebe o primero caractere
		 *  4- else - Quando o valor é divisivel por 2, o array recebe o segundo caractere
		 * */

		for(int i =0; i < array.length; i++) {
			for(int j = 0 ; j < array.length; j++) {
				if(i == j) {
					array[i][j] = " ";
				}else if(i % 2 != 0) {
					array[i][j] = caract;
				}else if(j % 2 != 0) {
					array[i][j] = caract;
				} else {
					array[i][j] = caractDois;
				}
				
			}

		}
	}
	
	public static void exibir(String[][] array) {
		System.out.print("|   |");
		for(int l =0; l < array.length; l++) {
			System.out.printf("| %-2d|", l+1);
		}
		System.out.print("\n");
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("| %-2d|", i+1);
			for(int j = 0 ; j < array.length; j++) {
				System.out.printf("\\ %-2s/",array[i][j] );
			}
			System.out.println("");
		}
	}
}
