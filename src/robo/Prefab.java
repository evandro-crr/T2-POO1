package robo;

import java.util.Random;

public class Prefab {

	private static Random ran = new Random();

	public static Braco[] braco = { new Braco("Braço padrão", 20, 20),
			new Braco("Braço forte", 15, 25),
			new Braco("Braço resistente", 25, 15) };
	public static Perna[] perna = { new Perna("Perna padrão", 20, 20),
			new Perna("Perna agil", 15, 25), new Perna("Perna forte", 25, 15) };
	public static Torso[] torso = { new Torso("Torso padrão", 20, 50),
			new Torso("Torso grande", 10, 80),
			new Torso("Torso resistente", 30, 40) };

	public static Robo roboAleatorio(String nome) {
		return new Robo(nome, braco[ran.nextInt(3)], perna[ran.nextInt(3)],
				torso[ran.nextInt(3)]);
	}
}
