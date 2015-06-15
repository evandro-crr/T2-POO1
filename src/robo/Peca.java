package robo;

public class Peca {

	private String nome;
	private int def;

	public Peca(String nome, int dEF) {
		super();
		this.nome = nome;
		def = dEF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDEF() {
		return def;
	}

	public void setDEF(int dEF) {
		def = dEF;
	}

}
