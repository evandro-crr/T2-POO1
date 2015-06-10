package competicao;

<<<<<<< HEAD
import java.util.Arrays;

public class Torneio {

	Competidor[] competidores = new Competidor[4];

	public Torneio(Competidor[] competidores, Competidor vencedor) {
		this.competidores = competidores;
	}

	Competidor vencedor = combates(competidores);

=======
public class Torneio {

	Competidor[] competidores = new Competidor[4];
	Competidor vencedor;

	public Torneio(Competidor[] competidores, Competidor vencedor) {
		this.competidores = competidores;
		this.vencedor = vencedor;
	}

>>>>>>> 0c58c5bb0bd9615f6f58d95f5b81ac104b7f2a31
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

<<<<<<< HEAD
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

=======
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
>>>>>>> 0c58c5bb0bd9615f6f58d95f5b81ac104b7f2a31
}
