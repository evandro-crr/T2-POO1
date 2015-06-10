package robo;

public class Peca {

	private String nome;
	private int DEF;

	public Peca(String nome, int dEF) {
		super();
		this.nome = nome;
		DEF = dEF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDEF() {
		return DEF;
	}

	public void setDEF(int dEF) {
		DEF = dEF;
	}

}
