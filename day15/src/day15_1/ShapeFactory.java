package day15_1;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String type) {
		if(type.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		} else if(type.equalsIgnoreCase("square")) {
			return new Square();
		}
			
		return null;
	}

}
