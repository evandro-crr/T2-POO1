package competicao;

import robo.Robo;

public class Competidor {

	private String nome;
	private robo.Robo robo;

	public Competidor(String nome, Robo robo) {
		this.nome = nome;
		this.robo = robo;
	}

	public String log = "";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public robo.Robo getRobo() {
		return robo;
	}

	public void setRobo(robo.Robo robo) {
		this.robo = robo;
	}

}
