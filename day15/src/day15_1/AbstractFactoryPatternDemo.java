package day15_1;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		FactoryProducer factoryProducer =  new FactoryProducer();
		AbstractFactory abstractFactory = 
				factoryProducer.getFactory(false);
		Shape shape = abstractFactory.getShape("rectangle");
		shape.draw();

	}

}
