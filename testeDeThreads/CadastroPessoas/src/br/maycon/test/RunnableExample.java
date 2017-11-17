package br.maycon.test;

public class RunnableExample {
	public static void main(String[] args) { 
		Thread thread1 = new Thread(new RunnableThread(), "thread 1");
		Thread thread2 = new Thread(new RunnableThread(), "thread 2");
		RunnableThread thread3 = new RunnableThread("thread 3"); 
		
		//Inicie os tópicos
		thread1.start(); 
		thread2.start(); 
		try { 
			
			//um segundo atraso sleep define
			
			Thread.currentThread().sleep(4000); } 
			catch (InterruptedException e) {
				
			} // Exibição do segmento principal
		System.out.println(Thread.currentThread()); }
		
	}

	

