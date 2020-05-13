package client;


import builder.ConcreteBuilderA;
import builder.ConcreteBuilderB;
import car.Car;
import director.Director;

public class Fabrica {

	public static void main(String[] args) {
		Director director = new Director();
		
		ConcreteBuilderA builder = new ConcreteBuilderA();
		director.constructorConcerteBuilderA(builder);
		
		Car car = builder.getResult();
		System.out.println(car.toString());
		


	}

}
