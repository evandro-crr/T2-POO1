package teste;

import competicao.Combate;
import competicao.Competidor;
import competicao.Torneio;

public class TesteMain {

	public static Competidor[] competidores = {
			new Competidor("João", robo.Prefab.roboAleatorio("AX-81")),
			new Competidor("Carlos", robo.Prefab.roboAleatorio("T-12")),
			new Competidor("Maria", robo.Prefab.roboAleatorio("Monstro")),
			new Competidor("Andre", robo.Prefab.roboAleatorio("Alcam_2")),
			new Competidor("Talis", robo.Prefab.roboAleatorio("Assinha")),
			new Competidor("Leandro", robo.Prefab.roboAleatorio("P-200")) };

	public static Torneio torneio = new Torneio(competidores);

	public static void main(String[] args) {

		torneio.setVencedor();

		System.out.println(torneio.getVencedor().getNome());

	}

}
