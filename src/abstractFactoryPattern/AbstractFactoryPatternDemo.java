package abstractFactoryPattern;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {

		// get shapeFactory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		// get colorFactory
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		// Different shapes array
		Shape[] shapes = { shapeFactory.getShape("circle"),
				shapeFactory.getShape("Square"),
				shapeFactory.getShape("Rectangle") };

		// different colors
		Color[] colors = { colorFactory.getColor("red"),
				colorFactory.getColor("blue"), colorFactory.getColor("green") };

		// call custom draw method based on an object of specific class

		for (Shape s : shapes) {
			s.draw();
		}

		// call color fill method based on an object of specific class

		for (Color s : colors) {
			s.fill();
		}

	}

}
