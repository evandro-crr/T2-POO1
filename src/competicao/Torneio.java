package competicao;

import java.util.Arrays;

public class Torneio {

	Competidor[] competidores = new Competidor[4];

	public Torneio(Competidor[] competidores, Competidor vencedor) {
		this.competidores = competidores;
	}

	Competidor vencedor = combates(competidores);

	public Competidor[] getCompetidores() {
		return competidores;
	}

	public void setCompetidores(Competidor[] competidores) {
		this.competidores = competidores;
	}

	public Competidor getVencedor() {
		return vencedor;
	}

	public void setVencedor(Competidor vencedor) {
		this.vencedor = vencedor;
	}

	public Competidor combates(Competidor[] competidores) {

		if (competidores.length == 2)
			return Combate.luta(competidores[0], competidores[1]);

		Competidor[] a = Arrays.copyOfRange(competidores, 0,
				competidores.length / 2);
		Competidor[] b = Arrays.copyOfRange(competidores,
				competidores.length / 2, competidores.length);

		Competidor aG = combates(a);
		Competidor bG = combates(b);

		return Combate.luta(aG, bG);

	}

}
