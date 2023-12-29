package abstract_class;

public class Main01 {

	public static void main(String[] args) {
		Shape shape = new Circle(5.0, "원");
		shape.draw();
		
		Shape rect = new Rect(5.0, 5.0, "사각형");
		rect.draw();
	}

}
