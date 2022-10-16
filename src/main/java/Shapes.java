public enum Shapes implements Methods{
    Square{
        @Override
        public double Calculate_field(double n) {
            return n*n;
        }

        @Override
        public double Calculate_perimeter(double n) {
            return 4*n;
        }
    },
    Circle{
        @Override
        public double Calculate_field(double n) {
            return Math.PI*n*n;
        }

        @Override
        public double Calculate_perimeter(double n) {
            return 2*Math.PI*n;
        }
    }
}
