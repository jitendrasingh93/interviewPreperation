package com.design.patterns.factory;

/**
 * Created by JitendraSingh on 25/01/18.
 */
public class FactoryMain {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of ractangle class and call its draw method.
        Shape shape = shapeFactory.getShape("RACTANGLE");
        shape.draw();
        
        //get an object of circle class and its call draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        //get an object of square class and call its draw method.
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();



    }
}
