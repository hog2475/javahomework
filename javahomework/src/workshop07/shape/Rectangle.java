package workshop07.shape;

public class Rectangle extends Shape implements Movable{
	int wideth;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int width,int x,int y) {
		// TODO Auto-generated constructor stub
		super(new Point(x, y));
		this.wideth = width;
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return wideth*wideth;
	}
	@Override
	double getCircumference() {
		// TODO Auto-generated method stub
		return Math.round(4*wideth);
	}
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		point.x += x+2;
		point.y += y+2;
	}
	

}
