package abstractFactoryPattern;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("shape")) {

			return new ShapeFactory();

		} else if (choice.equalsIgnoreCase("Color")) {

			return new ColorFactory();

		}

		return null;

	}

}
