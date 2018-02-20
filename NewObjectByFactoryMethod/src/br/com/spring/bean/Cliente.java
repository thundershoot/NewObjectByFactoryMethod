package br.com.spring.bean;

public class Cliente {

	private String name;

	private Cliente() {
		System.out.println("Cria cliente.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cliente [name=" + name + "]";
	}
	
	public static Cliente getInstance(){
		System.out.println("getInstance sem parametro.");
		return new Cliente();
	}
	
	public static Cliente getInstance(String nome){
		System.out.println("getInstance com parametro");
		Cliente cliente = new Cliente();
		cliente.setName(nome);
		return cliente;
	}
}
