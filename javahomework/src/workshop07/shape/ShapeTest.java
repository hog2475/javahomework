package workshop07.shape;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Shape> list = new ArrayList<Shape>();
		Rectangle rt1 = new Rectangle(4, 7, 5);
		Rectangle rt2 = new Rectangle(5, 4, 6);
		Circle cir1 = new Circle(6, 6, 7);
		Circle cir2 = new Circle(7, 8, 3);
		
		list.add(rt1);
		list.add(rt2);
		list.add(cir1);
		list.add(cir2);
		
		System.out.println("구분  \t\t 길이 \tx좌표\t y좌료\t Area\t Circumference");
		for(Shape s : list){
			if(s instanceof Rectangle){
				Rectangle rt = (Rectangle)s;
			System.out.println(rt.getClass().getSimpleName()+ "\t"+
					rt.wideth+"\t"+rt.point.x+"\t"+rt.point.y+
					"\t"+rt.getArea()+"\t"+rt.getCircumference());
			}else if(s instanceof Circle){
				Circle cir = (Circle) s;
				System.out.println(cir.getClass().getSimpleName()+ "\t\t"+
						cir.radius+"\t"+cir.point.x+"\t"+cir.point.y+
						"\t"+cir.getArea()+"\t"+cir.getCircumference());
			}	
		}
		for(Shape s : list){
			if(s instanceof Rectangle){
				Rectangle rt = (Rectangle)s;
				rt.move(10, 10);
			}else if(s instanceof Circle){
				Circle cir = (Circle) s;
				cir.move(10, 10);
			}	
		}
		for(Shape s : list){
			if(s instanceof Rectangle){
				Rectangle rt = (Rectangle)s;
			System.out.println(rt.getClass().getSimpleName()+ "\t"+
					rt.wideth+"\t"+rt.point.x+"\t"+rt.point.y);
			}else if(s instanceof Circle){
				Circle cir = (Circle) s;
				System.out.println(cir.getClass().getSimpleName()+ "\t\t"+
						cir.radius+"\t"+cir.point.x+"\t"+cir.point.y);
			}	
		}
	}

}
