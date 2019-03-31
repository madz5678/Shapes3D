package Curved3DShape;

import Shape3D.Shape;

public abstract class CurvedShapes implements Shape {

    private double radius;

    public CurvedShapes(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getSurfaceArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
