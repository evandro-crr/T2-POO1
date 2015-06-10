package robo;

public class Torso extends Peca {

	public Torso(String nome, int dEF, int hP) {
		super(nome, dEF);
		HP = hP;
	}

	private int HP;


	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

}
