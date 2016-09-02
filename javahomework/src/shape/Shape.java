package shape;

public abstract class Shape {

	int width;
	int height;
	String colors;
	public Shape() {
	}
	public Shape(int width,int height,String colors) {
		this.width = width;
		this.height = height;
		this.colors = colors;
	}
	abstract double getArea();
	public String toString(){
		return getClass().getSimpleName()+"\t"+getArea()+"\t"+colors;
	}
}
