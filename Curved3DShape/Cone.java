//This class implements the interface Shape and
//is responsible to implement all of the methods from
//Shape

package Curved3DShape;

import Curved3DShape.CurvedShapes;

public class Cone extends CurvedShapes {
    //state fields
    private double side;
    private double height;

    //constructors
    public Cone(double height, double radius, double side) {
        super(radius);
        this.height = height;
        this.side = side;
    }

    //surface area
    public double getSurfaceArea(){
        return Math.PI*Math.pow(getRadius(), 2) + Math.PI*getRadius()*side;
    }

    //volume
    public double getVolume(){
        return Math.PI*(1.0/3.0)*height*Math.pow(getRadius(), 2);
    }

}
