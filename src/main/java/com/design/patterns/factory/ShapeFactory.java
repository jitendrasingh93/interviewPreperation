package com.design.patterns.factory;

/**
 * Created by JitendraSingh on 25/01/18.
 */
public class ShapeFactory {

    //TODO: use getShape() method to get object of type shape.

    public Shape getShape(String shapeType) {

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }

        if (shapeType.equalsIgnoreCase("RACTANGLE")) {
            return new Ractangle();
        }

        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
