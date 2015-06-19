package competicao;

import robo.Robo;

public class Competidor {

	private String nome;
	private robo.Robo roboDoCompetidor;

	private String relatorio = "";

	public Competidor(String nome, Robo robo) {
		this.nome = nome;
		roboDoCompetidor = robo;

		relatorio = nome + "\nRobo: " + roboDoCompetidor.getNome()
				+ "\n| Braço: " + roboDoCompetidor.getBraco().getNome()
				+ "\n| Perna: " + roboDoCompetidor.getPerna().getNome()
				+ "\n| Torso: " + roboDoCompetidor.getTorso().getNome()
				+ "\nHP: " + roboDoCompetidor.getHP() + "\nATK: "
				+ roboDoCompetidor.getATK() + "\nDEF: "
				+ roboDoCompetidor.getDEF() + "\nAGL: "
				+ roboDoCompetidor.getAGL() + "\n\n";
	}

	public String getNome() {
		return nome;
	}

	public robo.Robo getRobo() {
		return roboDoCompetidor;
	}

	public String getRelatorio() {
		return relatorio;
	}

	public void setRelatorio(String relatorio) {
		this.relatorio += relatorio;
	}

}
