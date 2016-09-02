package shape;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape[] = new Shape[6];
		
		Triangle t1 = new Triangle(7, 5, "Blue");
		Rectangle r1 = new Rectangle(4, 6, "Blue");
		Triangle t2 = new Triangle(6, 7, "Red");
		Rectangle r2 = new Rectangle(8, 3, "Red");
		Triangle t3 = new Triangle(9, 8, "White");
		Rectangle r3 = new Rectangle(5, 7, "White");
		shape[0] = t1;
		shape[1] = r1;
		shape[2] = t2;
		shape[3] = r2;
		shape[4] = t3;
		shape[5] = r3;
		System.out.println("기본 정보");
		for(Shape sh:shape)
			System.out.println(sh);
		
		System.out.println("사이즈를 변경 후 정보");
		//setResize
		for(Shape sh:shape){
			if(sh instanceof Triangle){
				Triangle tmp = (Triangle)sh;
				tmp.setResize(5);
			}else if(sh instanceof Rectangle){
				Rectangle tmp = (Rectangle)sh;
				tmp.setResize(5);
			}
		}
		for(Shape sh:shape)
			System.out.println(sh);
	
		
	}

}
