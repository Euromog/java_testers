package test.java.auto;

public class MyFirst_Program {


	public static void main(String[] args) {

		Square s = new Square(6);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Square ss = new Square(8);
		System.out.println("Площадь квадрата2 со стороной " + ss.l + " = " + ss.area());

		Rectangle r = new Rectangle(2, 3);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

		Point p = new Point(4, 8);
		System.out.println("Дистанция между x и y = " + p.distance());


		System.out.println("Квадратный корень из = " + p.x + " = " + Math.sqrt(p.x));
		System.out.println("Квадратный корень из = " + p.y + " = " + Math.sqrt(p.y));


}









}