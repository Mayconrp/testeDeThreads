package br.maycon;

import java.util.Scanner;

public class Pessoas {
	
   public static void main(String args[]){
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Digite o nome:");
	   String nome = scan.nextLine();
	   System.out.println("Digite o tipo:");
	   String tipo = scan.nextLine();
	   Conta c1 = new Conta(nome, tipo);
	   c1.getStatus();
	   
   }
}
