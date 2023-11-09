package Polimorfismo;

public class Endereco extends Pessoa {
	private String cidade;
	private String bairro;
	private int numero;
	private String complemento;
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade; 
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public void dados() {
		System.out.println("Cidade: " + getCidade());
		System.out.println("Bairro: " + getBairro());
		System.out.println("Numero da residencia: " + getNumero());
		System.out.println("Complemento: " + getComplemento());
	}
}
