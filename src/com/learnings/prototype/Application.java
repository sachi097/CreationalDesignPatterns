package com.learnings.prototype;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        //Create Circle
        Circle circle = new Circle();
        circle.x = 0;
        circle.y = 0;
        circle.radius = 5;
        circle.color = "red";
        shapes.add(circle);

        //Create clone of Circle
        Circle anotherCircle = (Circle) circle.clone();
        anotherCircle.radius = 2;
        anotherCircle.color = "green";
        shapes.add(anotherCircle);

        //Create Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.x = 10;
        rectangle.y = 10;
        rectangle.length = 5;
        rectangle.width = 4;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneShapes(shapes, shapesCopy);
    }

    private static void cloneShapes(List<Shape> originalShapes, List<Shape> shapesCopy){
        for(Shape shape: originalShapes){
            shapesCopy.add(shape.clone());
        }

        //Compare originals and clones
        for(int i = 0; i<originalShapes.size(); i++){
            if(originalShapes.get(i) != shapesCopy.get(i)){
                System.out.println(i + ": Shapes are different Ojects!");
                if(originalShapes.get(i).equals(shapesCopy.get(i))){
                    System.out.println(i + ": And they are identical");
                }
                else{
                    System.out.println(i + ": But they are not identical");
                }
            }
            else{
                System.out.println(i + ": Shapes are same Objects!");
            }
        }
    }

}
