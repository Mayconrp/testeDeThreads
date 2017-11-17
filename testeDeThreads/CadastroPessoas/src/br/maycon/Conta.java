package br.maycon;

public class Conta {
	private String nome;
	private String tipo;
	public String status;
    
	public Conta(String n, String t){
	this.setNome(n);
	this.setTipo(t);
		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getStatus() {
		System.out.println("Conta: "+getNome());
		System.out.println("tipo: "+getTipo());
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	

}
