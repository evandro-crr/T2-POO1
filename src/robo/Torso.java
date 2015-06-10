package robo;

public class Torso extends Peca {

	private int HP;

	public Torso(String nome, int dEF, int hP) {
		super(nome, dEF);
		HP = hP;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

}
