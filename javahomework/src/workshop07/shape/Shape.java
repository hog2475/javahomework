package workshop07.shape;


public abstract class Shape {
	Point point;
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	public Shape(Point point) {
		// TODO Auto-generated constructor stub
		this.point = point;
	}
	abstract double getArea();
	abstract double getCircumference();
}
