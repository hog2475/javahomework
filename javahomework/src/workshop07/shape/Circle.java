package workshop07.shape;

public class Circle extends Shape implements Movable{
	int radius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(int radius,int x,int y) {
		// TODO Auto-generated constructor stub
		super(new Point(x, y));
		this.radius =radius;
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return Math.round(radius*radius*Math.PI);
	}
	@Override
	double getCircumference() {
		// TODO Auto-generated method stub
		return Math.round(2*radius*Math.PI);
	}
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		point.x += x+1;
		point.y += y+1;
	}
	
}
