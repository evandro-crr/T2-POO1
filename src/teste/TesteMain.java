package teste;

import interacao.UI;
import competicao.Competidor;
import competicao.Torneio;

// Classe com competidores pre-cadastrados para teste
public class TesteMain {

	public static Competidor[] competidoresTeste = {
			new Competidor("João", robo.Prefab.pecasAleatorias("AX-81")),
			new Competidor("Carlos", robo.Prefab.pecasAleatorias("T-12")),
			new Competidor("Maria", robo.Prefab.pecasAleatorias("Monstro")),
			new Competidor("Andre", robo.Prefab.pecasAleatorias("Alcam_2")),
			new Competidor("Talis", robo.Prefab.pecasAleatorias("Assinha")),
			new Competidor("Leandro", robo.Prefab.pecasAleatorias("P-200")) };

	public static void main(String[] args) {

		Torneio torneioTeste = new Torneio(competidoresTeste);

		boolean continuar = true;
		do {
			continuar = UI.relatorios(continuar, torneioTeste);

		} while (continuar);
	}
}
