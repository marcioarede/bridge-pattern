package br.unicentro.acaddecomp;

public abstract class RemoteControl {

	private boolean onoff;
	private TV implementor;
	
	public void on(){
		onoff = true;
		System.out.println("A TV est� ligada");
		
	}
	
	public void off(){
		onoff = false;
		System.out.println("A TV est� desligada");
	}
	
	public void setTV(TV implementor){
		this.implementor = implementor;
	}
	
	public void SetChannel(int channel){
		implementor.tuneChannel(channel);
	}
}
