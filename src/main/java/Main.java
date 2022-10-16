public class Main {
    public static void main(String[] args) {
        try {
            if (args[0].charAt(0) == 'c') {
                Circle circle = new Circle();
                circle.setRadius(Double.parseDouble(args[1]));
                System.out.println("Pole " + circle.Calculate_field());
                System.out.println("Obw " + circle.Calculate_perimeter());
            } else if (args[0].charAt(0) == 's') {
                Square square = new Square();
                square.setSide(Double.parseDouble(args[1]));
                System.out.println("Pole " + square.Calculate_field());
                System.out.println("Obw " + square.Calculate_perimeter());
            }
        }catch (Exception ex) {
            System.out.println("Incorect data");
        }
    }
}
