package factoryPattern;

public class ShapeFactory {

	// Use getShape method to get object of type shape

	public Shape getShape(String shapeType) {
		
		if (shapeType != null) {

			if (shapeType.equalsIgnoreCase("Circle")) {

				return new Circle();

			} else if (shapeType.equalsIgnoreCase("rectangle")) {

				return new Rectangle();

			} else if (shapeType.equalsIgnoreCase("square")) {

				return new Square();

			}

		}

		return null;

	}
}
