
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle
{
    private double radius;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    public double area()
    {
        return Math.PI*radius*radius;
    }
    
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
    
    public boolean equals( Object obj )
    {
        Circle c = (Circle)obj;
        
        if( this.radius == c.radius )
            return true;
        else
            return false;
    }
    
    public String toString()
    {
        return "Circle of radius " + this.radius;
    }
    
    
}

