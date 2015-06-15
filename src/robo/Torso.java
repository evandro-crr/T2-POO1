package robo;

public class Torso extends Peca {

	private int hp;

	public Torso(String nome, int def, int hp) {
		super(nome, def);
		this.hp = hp;
	}

	public int getHP() {
		return hp;
	}

	public void setHP(int hP) {
		hp = hP;
	}

}
