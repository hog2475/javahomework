package shape;

public class Rectangle extends Shape implements Resize {
	
	public Rectangle() {
	}
	public Rectangle(int width,int height,String colors) {
		super(width, height, colors);
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return height*width;
	}
	@Override
	public void setResize(int size) {
		// TODO Auto-generated method stub
		width+=size;
	}
	

}
