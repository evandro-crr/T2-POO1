package robo;

public class Braco extends Peca {

	private int ATK;

	public Braco(String nome, int dEF, int aTK) {
		super(nome, dEF);
		ATK = aTK;
	}

	public int getATK() {
		return ATK;
	}

	public void setATK(int aTK) {
		ATK = aTK;
	}

}
