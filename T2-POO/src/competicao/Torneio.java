package competicao;

public class Torneio {

	Competidor[] competidores = new Competidor[4];
	Competidor vencedor;

	public Torneio(Competidor[] competidores, Competidor vencedor) {
		this.competidores = competidores;
		this.vencedor = vencedor;
	}

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

	public void iniciaTorneio() {
		// luta entre [0] e [1]

		// luta entre [2] e [3]

		// luta entre ganhadorLuta1 e ganhadorLuta2

		// vencedor = ganhadorLuta3
	}

	public void iniciaLuta(Competidor a, Competidor b) {
		// trocar void por Competidor quando decidir o funcionamento do metodo

		// return ganhador;
	}
}
