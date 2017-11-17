package br.maycon.test;

public class teste {
	    static int i = 0;
	    public static void main(String[] args) {
	    	// invoca a thread 
	    	t1.run();
	    	t2.run();
	    	
	       
	    }

	    private static void countMe(String name){
	        i++;
	        System.out.println("O Contador atual é: " + i + " ,atualizado por: " + name);
	    }
      // implementação da thread
	    private static Runnable t1 = new Runnable() {
	        public void run() {
	            try{
	                for(int i=0; i<20; i++){
	                    countMe("t1");
	                }
	            } catch (Exception e){}
	        }
	        
	    };

	    private static Runnable t2 = new Runnable() {
	        public void run() {
	            try{
	                for(int i=0; i<20; i++){
	                    countMe("t2"); 
	                }
	            } catch (Exception e){}
	       }
	    };
	
}
