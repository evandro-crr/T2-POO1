package robo;

public class Braco extends Peca {

	private int atk;

	public Braco(String nome, int def, int atk) {
		super(nome, def);
		this.atk = atk;
	}

	public int getATK() {
		return atk;
	}

}
