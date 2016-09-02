package shape;

public class Triangle extends Shape implements Resize{
	
	public Triangle() {
	}
	public Triangle(int width,int height,String colors) {
		super(width, height, colors);
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return height*width/2.0;
	}
	@Override
	public void setResize(int size) {
		// TODO Auto-generated method stub
		height+=size;
	}
	

}
