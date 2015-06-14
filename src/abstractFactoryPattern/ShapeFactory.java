package abstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {

	Color getColor(String color) {
		return null;
	}

	public Shape getShape(String shapeType) {

		if (shapeType != null) {
			
			if(shapeType.equalsIgnoreCase("Circle")){
				
				return new Circle();
				
			} else if(shapeType.equalsIgnoreCase("Rectangle")){
				
				return new Rectangle();
				
			} else if(shapeType.equalsIgnoreCase("Square")){
				
				return new Square();
				
			}
			
		}
		return null;
	}

}
