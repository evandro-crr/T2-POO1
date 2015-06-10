package robo;

public class Peca {

	private String nome;
	private int def;

	public Peca(String nome, int _def) {
		super();
		this.nome = nome;
		def = _def;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDef() {
		return def;
	}

	public void setDEF(int _def) {
		def = _def;
	}

}
