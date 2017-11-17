package br.maycon.test;

public class RunnableThread implements Runnable {
	
		Thread runner; public RunnableThread() { 
		} public RunnableThread(String threadName) { 
			runner = new Thread(this, threadName); //Criação de linhas novas 
			System.out.println(runner.getName()); 
			runner.start(); // Iniciação de linha

			
		} public void run() { 
				//Exibindo detalhes sobre o segmento específico
				System.out.println(Thread.currentThread()); }
	}



