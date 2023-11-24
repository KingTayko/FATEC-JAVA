package Herenca;

public class Funcionario {
	public String nome;
	public int idade;
	public String sexo;
	
	public void baterPonto() {
		System.out.println("Batendo ponto...");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
	
}
