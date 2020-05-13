package builder;

import car.Car;

public class ConcreteBuilderB implements Builder{
	private String marca;
	private String motor;
	private String pneus;
	

	@Override
	public void setMotor(String m) {
		this.motor = m;
		
	}

	@Override
	public void setPneu(String p) {
		this.pneus = p;
		
	}

	@Override
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Car getResult() {
		return new Car(marca,motor,pneus);
	}



}
