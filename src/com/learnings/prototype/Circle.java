package com.learnings.prototype;

import java.util.Objects;

public class Circle extends Shape{
    public int radius;

    public Circle(){}

    Circle(Circle source){
        super(source);
        if(source != null){
            this.radius = source.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2){
        if(!(object2 instanceof Circle)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}
