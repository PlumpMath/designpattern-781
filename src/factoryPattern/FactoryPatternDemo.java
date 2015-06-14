package factoryPattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactory();

		// get an object of individual class and call its draw method thru the
		// loop
		Shape[] shapes = { shapeFactory.getShape("circle"),
				shapeFactory.getShape("rectangle"),
				shapeFactory.getShape("square") };

		for (Shape s : shapes) {
			s.draw();
		}

	}

}