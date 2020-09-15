package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Programa {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Cadastro da Conta
		System.out.println("Vamos cadastrar a conta, digite o nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite o numero da conta: ");
		int numConta = sc.nextInt();
		
		Conta conta = new Conta(nome, numConta);
		
		//Deposito Inicial
		System.out.println("Você quer depositar um valor inicial? (s/n)");
		char resp = sc.next().charAt(0);
		if(resp == 's')
		{
			System.out.println("Digite o valor do depósito: ");
			double depositos = sc.nextDouble();
			conta.depositoConta(depositos);
			System.out.println(conta);
		}
		else
		{
			System.out.println(conta);
		}
		
		//Repetição do Programa.
		do 
		{
			System.out.println("Qual operação você quer fazer?");
			System.out.println("Saque (s)  -  Deposito(d)");
			resp = sc.next().charAt(0);
			
			if(resp == 's')
			{
				System.out.println("Digite quanto você quer sacar: ");
				double saque = sc.nextDouble();
				conta.saqueConta(saque);
				System.out.println(conta);
			}
			
			else if(resp == 'd')
			{
				System.out.println("Digite quanto você quer depositar");
				double depositos = sc.nextDouble();
				conta.depositoConta(depositos);
				System.out.println(conta);
			}
			
			System.out.println("Você quer executar mais operações?");
			System.out.println("Sim (s)  -  Não(n)");
			resp = sc.next().charAt(0);
		} while(resp == 's');
		
		sc.close();
	}
}
