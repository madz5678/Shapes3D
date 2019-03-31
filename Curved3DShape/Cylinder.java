//This class implements the interface Shape and
//is responsible to implement all of the methods from
//Shape

package Curved3DShape;

import Curved3DShape.CurvedShapes;

public class Cylinder extends CurvedShapes {
    //state fields
    private double height;

    //constructors
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    //surface area
    public double getSurfaceArea(){
        return 2*Math.PI*Math.pow(getRadius(), 2) + 2*Math.PI*getRadius()*height;
    }

    //volume
    public double getVolume(){
        return Math.PI*height*Math.pow(getRadius(), 2);
    }

}

