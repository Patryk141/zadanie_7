public class Circle extends Shapes implements Methods{
    Double radius;

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double Calculate_field() {
        return Math.PI*radius*radius;
    }

    @Override
    public double Calculate_perimeter() {
        return 2*Math.PI*radius;
    }
}
