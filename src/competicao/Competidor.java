package competicao;

import robo.Robo;

public class Competidor {

	private String nome;
	private robo.Robo competidorRrobo;

	public String log = "";

	public Competidor(String nome, Robo robo) {
		this.nome = nome;
		this.competidorRrobo = robo;
		log = nome+"\nRobo: " + competidorRrobo.getNome() + "\n| Braço: "
				+ competidorRrobo.getBraco().getNome() + "\n| Perna: "
				+ competidorRrobo.getPerna().getNome() + "\n| Torso: "
				+ competidorRrobo.getTorso().getNome() + "\nHP: "
				+ competidorRrobo.getHP() + "\nATK: "
				+ competidorRrobo.getATK() + "\nDEF: "
				+ competidorRrobo.getDEF() + "\nAGL: "
				+ competidorRrobo.getAGL() + "\n\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public robo.Robo getRobo() {
		return competidorRrobo;
	}

	public void setRobo(robo.Robo robo) {
		this.competidorRrobo = robo;
	}

}
