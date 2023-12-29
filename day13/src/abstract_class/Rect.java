package abstract_class;

public class Rect extends Shape {
	private double wid;
	private double hei;
	
	public Rect() {}
	public Rect(double wid, double hei, String name) {
		super(name);
		this.wid = wid;
		this.hei = hei;
	}
	@Override
	public double area() {
		double rArea = wid*hei;
		return rArea;
	}

	@Override
	public double perimeter() {
		double rPerimeter = 2*(wid+hei);
		return rPerimeter;
	}

}
