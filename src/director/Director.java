package director;

import builder.Builder;

public class Director {

	public void constructorConcerteBuilderA(Builder builder) {
		builder.setMarca("BMW");
		builder.setMotor("Motor de Aluminio");
		builder.setPneu("Pneus de silicone");
	}
	
	public void constructorConcerteBuilderB(Builder builder) {
		builder.setMarca("Gol");
		builder.setMotor("Motor de Aço");
		builder.setPneu("Pneus de Borracha Natural");
	}
}
