//This class implements the interface Shape and
//is responsible to implement all of the methods from
//Shape

package Curved3DShape;

import Curved3DShape.CurvedShapes;

public class Sphere extends CurvedShapes {

    //constructors
    public Sphere(double r) {
        super(r);
    }

    //surface area
    public double getSurfaceArea(){
        return Math.PI*Math.pow(2, 2)*getRadius()*4;
    }

    //volume
    public double getVolume(){
        return Math.pow(getRadius(), 3)*(4.0/3.0)*Math.PI;
    }

}