package br.unicentro.acaddecomp;

public abstract class RemoteControl {

	private boolean onoff;
	private TV implementor;
	
	public void on(){
		onoff = true;
		System.out.println("A TV está ligada");
		
	}
	
	public void off(){
		onoff = false;
		System.out.println("A TV está desligada");
	}
	
	public void setTV(TV implementor){
		this.implementor = implementor;
	}
	
	public void SetChannel(int channel){
		implementor.tuneChannel(channel);
	}
}
