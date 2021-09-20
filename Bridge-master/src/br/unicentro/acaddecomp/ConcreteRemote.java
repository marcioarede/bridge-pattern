package br.unicentro.acaddecomp;

public class ConcreteRemote extends RemoteControl {

	private int station;
	
	public ConcreteRemote(TV implementor){
		this.setTV(implementor);
	}
	
	public void setStation(int station){
		this.station = station;
	}
	
	public void nextChannel(int channel){
		this.SetChannel(station + 1);
	}
	
	public void previousChannel(int channel){
		this.SetChannel(station - 1);
	}
}
