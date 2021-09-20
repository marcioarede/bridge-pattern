package br.unicentro.acaddecomp;

public class RCA implements TV {

	private boolean onoff = false;
	private int channel;

	@Override
	public void on() {
		onoff = true;
		System.out.println("A TV está ligada");

	}

	@Override
	public void off() {
		onoff = false;
		System.out.println("A TV está desligada");

	}

	@Override
	public void tuneChannel(int channel) {
		this.channel = channel;
	}

}
