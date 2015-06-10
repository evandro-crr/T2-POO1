package robo;

public class Perna extends Peca {

	private int AGL;

	public Perna(String nome, int dEF, int aGL) {
		super(nome, dEF);
		AGL = aGL;
	}

	public int getAGL() {
		return AGL;
	}

	public void setAGL(int aGL) {
		AGL = aGL;
	}

}
