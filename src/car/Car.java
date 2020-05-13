package car;

public class Car {
	private String motor;
	private String pneus;
	private String marca;
	
	public Car(String motor,String pneus,String marca) {
		this.marca = marca;
		this.pneus = pneus;
		this.motor = motor;
		
	}

	public String getMotor() {
		return motor;
	}


	public String getPneus() {
		return pneus;
	}



	public String getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return "Car [motor=" + motor + ", pneus=" + pneus + ", marca=" + marca + "]";
	}



	
}
