package br.maycon.test;

public class RunnableThread implements Runnable {
	
		Thread runner; public RunnableThread() { 
		} public RunnableThread(String threadName) { 
			runner = new Thread(this, threadName); //Cria��o de linhas novas 
			System.out.println(runner.getName()); 
			runner.start(); // Inicia��o de linha

			
		} public void run() { 
				//Exibindo detalhes sobre o segmento espec�fico
				System.out.println(Thread.currentThread()); }
	}



