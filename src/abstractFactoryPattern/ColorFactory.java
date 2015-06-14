package abstractFactoryPattern;

public class ColorFactory extends AbstractFactory {

	public Color getColor(String color) {

		if (color != null) {

			if (color.equalsIgnoreCase("Green")) {

				return new Green();

			} else if (color.equalsIgnoreCase("Red")) {

				return new Red();

			} else if (color.equalsIgnoreCase("blue")) {

				return new Blue();

			}

		}
		return null;
	}

	Shape getShape(String shapeType) {
		return null;
	}

}
