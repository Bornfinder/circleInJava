class Circle{
    private float radius,area,circumference;
    float π = 3.14f;

    //for radius
    public void setRadius(float circumference){
        radius=circumference/(2*π) ;
    }
    public float getRadius(){
        return radius;
    }

    //for area
    public void setArea(float radius )
    {
        area=π*(radius*radius);
    }
    public float getArea()
    {
        return area;
    }

    //for circumference
    public void setCircumference(float radius) {
        circumference= 2*π*radius;
    }
    public float getCircumference() {
        return circumference;
    }
}

public class CalculationOfCircle {
    public static void main(String[] args) {
        Circle cr= new Circle();
        // setter ----------------------- -->
        // Enter the value of the circumference of the circle
        cr.setRadius(31.4f);// sample input 31.4f

        //Enter the value of the Radius of circle
        cr.setArea(5);// sample input 5

        //Enter the value of Radius of circle
        cr.setCircumference(5);// sample input 5

        // getter ---------------------- -->
        System.out.println("the radius of the circle = "+cr.getRadius()); //sample output 5
        System.out.println("the area of the circle = "+cr.getArea());//sample output 78.5
        System.out.println("the circumference of the circle = "+cr.getCircumference());//sample output 31.4

    }
}