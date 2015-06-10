package robo;

public class Perna extends Peca {
	
	public Perna(String nome, int dEF, int aGL) {
		super(nome, dEF);
		AGL = aGL;
	}

	private int AGL;

	public int getAGL() {
		return AGL;
	}

	public void setAGL(int aGL) {
		AGL = aGL;
	}



}
