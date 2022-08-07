package com.learnings.prototype;

import java.util.Objects;

public class Rectangle extends Shape{
    public int length;
    public int width;

    public Rectangle(){}

    Rectangle(Rectangle source){
        super(source);
        if(source != null){
            this.width = source.width;
            this.length = source.length;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2){
        if(!(object2 instanceof Rectangle)) return false;
        Rectangle shape2 = (Rectangle) object2;
        return shape2.width == width && shape2.length == length;
    }

}
