package interacao;

import competicao.Torneio;

public class Controle {

	public static void main(String[] args) {

		Torneio torneio = new Torneio(UI.cadastrarCompetidores());

		boolean continuar = true;
		do {

			continuar = UI.relatorios(continuar, torneio);

		} while (continuar);
	}

}
