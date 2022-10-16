public class Square extends Shapes implements Methods{
    Double side;

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    public double Calculate_field() {
        return side*side;
    }

    @Override
    public double Calculate_perimeter() {
        return 4*side;
    }
}
